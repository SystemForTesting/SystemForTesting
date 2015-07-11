function SlidePanel() {
    this.isPushedAway = false;
    this.doSlide = function (element) {
        var slidePanel = $(element).parent('div');
        if (this.isPushedAway == false) {
            $(slidePanel).animate({left: "-200px"}, 500);
            this.isPushedAway = true;
        } else {
            $(slidePanel).animate({left: "0px"}, 500);
            this.isPushedAway = false;
        }
    }
};
//----------------------------------------------------------------
function WidePanel() {
    this.isExpanded = false;
    this.previousElement = null;
    var widePanel = this;

    this.doExpand = function (element) {
        if (widePanel.previousElement != null && widePanel.previousElement != element){
            if (widePanel.isExpanded == false)
                widePanel.slideToDown(widePanel.previousElement);
            else
                widePanel.slideToLeft(widePanel.previousElement, function(){
                    widePanel.previousElement = element;
                    widePanel.slideToDown(element);
                });
        }else{
            widePanel.previousElement = element;
            if (widePanel.isExpanded == false)
                widePanel.slideToDown(element);
            else
                widePanel.slideToLeft(element);
        }
    };

    this.slideToLeft = function (element, callback) {
        if (widePanel.isExpanded == false) {
            $(element).parent('td').addClass('selected-row');
            $(element).addClass('selected-row');
            $(element).animate({left: "-200px"}, 150);
        } else {
            $(element).parent('td').removeClass('selected-row');
            if (isFunction(callback))$(element).animate({left: "0px"}, 150, widePanel.slideToDown(element), callback);
            else $(element).animate({left: "0px"}, 150, widePanel.slideToDown(element));
            widePanel.isExpanded = false;
        }
    };

    this.slideToDown = function (element) {
        if (widePanel.isExpanded == false) {
            $(element).parent('td').addClass('selected-row');
            $(element).animate({height: "300px"}, 150, widePanel.slideToLeft(element));
            widePanel.isExpanded = true;
        } else {
            $(element).parent('td').removeClass('selected-row');
            $(element).animate({height: "100%"}, 150);
        }
    };
};

function isFunction(functionToCheck) {
    var getType = {};
    return functionToCheck && getType.toString.call(functionToCheck) === '[object Function]';
}

var slidePanel = new SlidePanel();
var widePanel = new WidePanel();