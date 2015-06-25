$('.main-quest-panel').on('click','.add-qwest-button',function(){
    var nextQuestionId = $('.question-form').last().attr('id') - 1 + 2;
    var nextQuestionNumber = $('.question-form').last().attr('id') - 1 + 3;

    $('.questions').append('<div class="question-form" id="' + nextQuestionId +'"><label>' +'Вопрос №' + nextQuestionNumber +'</label><div><textarea name="questions['+nextQuestionId+'].title" rows="3" class="form-control vresize"></textarea></div><div class="answers"> <div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea name="questions['+nextQuestionId+'].answers[0].text" rows="3" class="form-control vresize"></textarea><span class="input-group-addon"><input type="checkbox" name="questions['+nextQuestionId+'].answers[0].right"> </span></div></div></div><div class="answer"><div></div></div> <div class="answer"><div</div></div> </div><a onclick="addAnswer(this)" href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a> <div class="clearfix"></div></div>');
    $('textarea').last().focus();
});

function addAnswer(element){
    var currentAnswerCout = $(element).parent('.question-form').children('.answers').children('.answer').size();
    var currentQuestionId = $(element).parent('.question-form').attr('id');

    $(element).parent().children('.answers').append('<div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea name="questions['+currentQuestionId+'].answers['+currentAnswerCout+'].text" rows="3" class="form-control vresize" style="margin-top: 0px; margin-bottom: 0px; height: 78px;"></textarea> <span class="input-group-addon"><input type="checkbox" name="questions['+currentQuestionId+'].answers['+currentAnswerCout+'].right"></span></div></div></div>');
    $('a').last().focus();
}

function removeAnswer(element){
    $(element).parent().parent().parent().parent().remove();
    $('a').last().focus();
}

//'<div class="question-form"><label>Вопрос №</label><div><textarea class="form-control" rows="3" style="margin: 0px -7px 0px 0px; width: 914px; height: 80px;"></textarea></div><div class="answers"><div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea class="form-control" rows="3" style="margin: 0px; width: 837px; height: 74px;"></textarea><span class="input-group-addon"><input type="checkbox" aria-label="..."></span></div></div></div></div><a onclick="addAnswer(this)" href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a><div class="clearfix"></div></div>'