import geb.Module

class SelectTabModule extends Module {
    static content = {
        tab {
            id -> $("#tab-video-" + id)
        }
    }

    void select(index) {
        tab(index).click()
    }
}
