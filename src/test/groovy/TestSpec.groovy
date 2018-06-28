import geb.spock.GebSpec

class TestSpec extends GebSpec {
    def setupSpec() {
        browser.config.autoClearCookies = false
        reportGroup(getClass())
    }

    def "공채 페이지 이동"() {
        when:
        to SynapHomePage

        then:
        recruit.text().indexOf("공채") > -1

        expect:
        withNewWindow({ open() }, wait: true) {
            report("recruit page")
            at(RecruitPage)
        }
    }

    def "공채 페이지 바로 접속"() {
        when:
        to RecruitPage

        then:
        at RecruitPage
    }

    def "웹오피스 제품 소개"() {
        given:
        to SynapHomePage

        when:
        $("a.SynapOffice").click()

        then:
        at WebOfficePage

        when:
        tabModule.select(1)

        then:
        tabModule.tab(1).hasClass("tab1S1")
    }
}