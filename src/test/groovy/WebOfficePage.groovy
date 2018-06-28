import geb.Page

class WebOfficePage extends Page {
    static url = "/jsp/product/webOffice.jsp"

    static content = {
        tabModule { module(SelectTabModule) }
    }

    static at = {
        $("#snb").find("li.sel").text().indexOf("Office") > -1
    }
}
