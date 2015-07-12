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
    this.animationSpeed = 150;
    this.slidePixelsCount = -200;
    this.slidePanelIndent = 10;
    this.dropPanelPixelsCount = 300;
    this.isExpanded = false;
    this.previousElement = null;
    this.processing = false;
    var widePanel = this;

    this.doExpand = function (element) {
        if (widePanel.processing == false) {
            widePanel.processing = true;
            if (widePanel.previousElement != null && widePanel.previousElement != element && widePanel.isExpanded == true) {
                widePanel.slideToDownTop($(widePanel.previousElement).prev(), function () {
                    widePanel.slideToLeftRight(widePanel.previousElement, function(){widePanel.slideToLeftRight(element)});
                    widePanel.previousElement = element;
                });
            } else {
                widePanel.previousElement = element;
                if (widePanel.isExpanded == false)
                    widePanel.slideToLeftRight(element);
                else
                    widePanel.slideToLeftRight(element);
            }
        }
    };


    this.slideToLeftRight = function (element, callback) {
        var elementDropPanel = $(element).prev();

        if (widePanel.isExpanded == false) {
            var elementWidth = parseInt($(element).css('width'), 10) + Math.abs(widePanel.slidePixelsCount);
            var dropPanelWidth = Math.abs(widePanel.slidePixelsCount) - widePanel.slidePanelIndent;
            $(element).animate({left: widePanel.slidePixelsCount, width: elementWidth}, widePanel.animationSpeed);
            $(elementDropPanel).animate({left: widePanel.slidePixelsCount, width: dropPanelWidth}, widePanel.animationSpeed, function () {
                widePanel.slideToDownTop(elementDropPanel)
            });
        } else {
            widePanel.slideToDownTop(elementDropPanel, function () {
                $(elementDropPanel).animate({left: "0px", width: "100%"}, widePanel.animationSpeed);
                $(element).animate({left: "0px", width: "100%"}, widePanel.animationSpeed);
                widePanel.isExpanded = false;

                if (isFunction(callback) == true){
                    callback();
                } else widePanel.processing = false;
            })
        }
    };

    this.slideToDownTop = function (element, callback) {
        if (widePanel.isExpanded == false) {
            $(element).animate({height: widePanel.dropPanelPixelsCount}, widePanel.animationSpeed);
            widePanel.isExpanded = true;
            widePanel.processing = false;
        } else {
            $(element).animate({height: "100%"}, widePanel.animationSpeed, callback);
        }
    };
};

function isFunction(functionToCheck) {
    var getType = {};
    return functionToCheck && getType.toString.call(functionToCheck) === '[object Function]';
}

var slidePanel = new SlidePanel();
var widePanel = new WidePanel();