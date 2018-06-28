import geb.Page

class SynapHomePage extends Page {

    static at = {
        title == "사이냅소프트"
    }

    static content = {
        recruit {
            $("div#gnb").find("a", 0)
        }
    }

    void open() {
        recruit.click()
    }
}
