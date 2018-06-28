import geb.Page

class RecruitPage extends Page {
    static url = "/jsp/recruit/1806.html"

    static at = {
        title.contains("사이냅소프트 2018 하계 공채")
    }
}
