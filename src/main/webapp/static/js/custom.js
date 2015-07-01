//------------------------------START ADMIN PAGE------------------------------------------------

$('.main-quest-panel').on('click','.add-qwest-button',function(){
    var nextQuestionId = $('.question-form').last().attr('id') - 1 + 2;
    var nextQuestionNumber = $('.question-form').last().attr('id') - 1 + 3;

    $('.questions').append('<div class="question-form" id="' + nextQuestionId +'"><label>' +'Вопрос №' + nextQuestionNumber +'</label><div><textarea name="questions['+nextQuestionId+'].title" rows="3" class="form-control vresize"></textarea></div><div class="answers"> <div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea name="questions['+nextQuestionId+'].answers[0].text" rows="3" class="form-control vresize"></textarea><span class="input-group-addon"><input type="checkbox" name="questions['+nextQuestionId+'].answers[0].right"> </span></div></div></div></div><a onclick="addAnswer(this)" href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a> <div class="clearfix"></div></div>');
    $('textarea').last().focus();
});

function addAnswer(element){
    var currentAnswerCount = $(element).parent('.question-form').children('.answers').children('.answer').size();

    $(element).parent().children('.answers').append('<div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea name="answers['+currentAnswerCount+'].text" rows="3" class="form-control vresize" style="margin-top: 0px; margin-bottom: 0px; height: 78px;"></textarea> <span class="input-group-addon"><input type="checkbox" name=answers['+currentAnswerCount+'].right"></span></div></div></div>');
    $('a').last().focus();
}

function removeAnswer(element){
    $(element).parent().parent().parent().parent().remove();
    $('a').last().focus();
}

//------------------------------END ADMIN PAGE------------------------------------------------

//------------------------------START USER PAGE------------------------------------------------

function switchQuestionToNext(){
    var currentQuest = $('.question-button.current').attr('id');

}

//------------------------------END USER PAGE------------------------------------------------
