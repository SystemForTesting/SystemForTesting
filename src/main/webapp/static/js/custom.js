//------------------------------START ADMIN PAGE------------------------------------------------

$('.main-quest-panel').on('click', '.add-qwest-button', function () {
    var nextQuestionId = $('.question-form').last().attr('id') - 1 + 2;
    var nextQuestionNumber = $('.question-form').last().attr('id') - 1 + 3;
    if (isNaN(nextQuestionNumber)) {
        nextQuestionId = 0;
        nextQuestionNumber = 1;
    }
    $('.questions').append('<div class="question-form" id="' + nextQuestionId + '"><label>' + 'Вопрос №' + nextQuestionNumber + '</label><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeQuestion(this)" aria-hidden="true"></span></span><textarea name="questions[' + nextQuestionId + '].title" rows="3" class="form-control vresize"></textarea></div><div class="answers"><div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea name="questions[' + nextQuestionId + '].answers[0].text" rows="3" class="form-control vresize"></textarea><span class="input-group-addon"><input type="checkbox" name="questions[' + nextQuestionId + '].answers[0].right"> </span></div></div></div></div><a onclick="addAnswer(this)" href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a><div class="clearfix"></div></div>');
    $('textarea').last().focus();
});

function addAnswer(element) {
    var currentAnswerCount = $(element).parent('.question-form').children('.answers').children('.answer').size();

    $(element).parent().children('.answers').append('<div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea name="answers[' + currentAnswerCount + '].text" rows="3" class="form-control vresize" style="margin-top: 0px; margin-bottom: 0px; height: 78px;"></textarea> <span class="input-group-addon"><input type="checkbox" name=answers[' + currentAnswerCount + '].right"></span></div></div></div>');
    $('a').last().focus();
}

function removeAnswer(element) {
    $(element).parent().parent().parent().parent().remove();
    $('a').last().focus();
}

//------------------------------END ADMIN PAGE------------------------------------------------

//------------------------------START USER PAGE------------------------------------------------

$(document).keydown(function (e) {
    switch (e.which) {
        case 37: // left
            switchQuestionToPrevious();
            break;
        case 39: // right
            switchQuestionToNext();
            break;
        default:
            return; // exit this handler for other keys
    }
    e.preventDefault(); // prevent the default action (scroll / move caret)
});

function switchQuestionToNext() {
    var currentQuest = $('.question-button.current').attr('id');
    if (currentQuest < $('.question-button').size()) {
        var nextQuest = currentQuest - 1 + 2;
        $(".question-button#" + currentQuest + "").removeClass('current');
        $(".question-button#" + nextQuest + "").addClass('current');

        $("#question" + currentQuest + "").addClass('hidden');
        $("#question" + nextQuest + "").removeClass('hidden');

        var answeredCount = $("#question" + currentQuest + " .answers div div input:checked").size();
        if (answeredCount < 1) {
            $(".question-button#" + currentQuest + "").addClass('missed');
        } else $(".question-button#" + currentQuest + "").removeClass('missed');
    }
}

function switchQuestionToPrevious() {
    var currentQuest = $('.question-button.current').attr('id');
    if (currentQuest > 1) {
        var previousQuest = currentQuest - 1;
        $(".question-button#" + currentQuest + "").removeClass('current');
        $(".question-button#" + previousQuest + "").addClass('current');
        $("#question" + currentQuest + "").addClass('hidden');
        $("#question" + previousQuest + "").removeClass('hidden');

        var answeredCount = $("#question" + currentQuest + " .answers div div input:checked").size();
        if (answeredCount < 1) {
            $(".question-button#" + currentQuest + "").addClass('missed');
        } else $(".question-button#" + currentQuest + "").removeClass('missed');
    }
}

function selectQuestion(element) {
    var currentQuest = $('.question-button.current').attr('id');
    var selectedQuest = $(element).parent().children('button').attr('id');

    $("#question" + currentQuest + "").addClass('hidden');
    $("#question" + selectedQuest + "").removeClass('hidden');

    $(".question-button#" + currentQuest + "").removeClass('current');
    $(element).addClass('current');

    var answeredCount = $("#question" + currentQuest + " .answers div div input:checked").size();
    if (answeredCount < 1) {
        $(".question-button#" + currentQuest + "").addClass('missed');
    } else $(".question-button#" + currentQuest + "").removeClass('missed');
}

function addMissed() {
    var currentQuestion = $('.question-button.current');
    currentQuestion.addClass('not-sure');
};

$('.onoffswitch').on('click', 'input', function () {
    if ($(this).is(':checked'))
        $('.question-button.current').addClass('not-sure');
    else
        $('.question-button.current').removeClass('not-sure');

});

function getButtonChar(element, currentIndex) {
    var firsChar = "A".charCodeAt(0) - 1;
    var nextChar = String.fromCharCode(firsChar + currentIndex);
    $(element).text(nextChar)
}

function selectAnswer(element) {
    $(element).parent().parent().parent().children('div').children('div').children('input').parent().children('label').removeClass('selected-answer');
    $(element).parent().parent().parent().children('div').children('div').children('input:checked').parent().children('label').addClass('selected-answer');

    $(".question-button.current").addClass('answered');
}

$(document).ready(function () {
    var allSpans = $('.custom-btn-block label span');
    var firsChar = "A".charCodeAt(0);

    $.each(allSpans, function (index, value) {
        var currentIndex = $(value).attr('current-index');
        var summ = parseInt(firsChar, 10) + parseInt(currentIndex, 10);
        var nextChar = String.fromCharCode(summ);
        $(value).text(nextChar)
    });
});
//------------------------------END USER PAGE------------------------------------------------
