var app = new Vue({
    el: '#app',
    data: {
        activeMenuIndex:"Home",
        activeTabName:"2020",
        activeNewsName:"The-2nd-national-forum",
    },
    methods : {
        menuSelect: function (index, indexPath) {
            console.log(index,indexPath)
            if(index == "userentrance"){
                return
            }
            let origin = "#" + this.activeMenuIndex
            let destination
            if(indexPath.length == 1)
                 destination = "#" + index
            else
                 destination = "#" + indexPath[1]

            $(origin).hide();
            $(destination).fadeIn();
            this.activeMenuIndex = index

        },
        newsJump(e){
            id = (e.target.id).replace("#","")
            $("#" + this.activeMenuIndex).hide()
            this.activeTabName = "2021"
            this.activeNewsName = id
            $("#" + "Events").fadeIn()
            this.activeMenuIndex = "Events"
        },
    }

})