$('.main-quest-panel').on('click','.add-qwest-button',function(){
    $('.questions').append('<div class="question-form"><label>Вопрос №</label><div><textarea class="form-control" rows="3"></textarea></div><div class="answers"><div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea class="form-control" rows="3"></textarea><span class="input-group-addon"><input type="checkbox" aria-label="..."></span></div></div></div></div><a onclick="addAnswer(this)" href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a><div class="clearfix"></div></div>');
    $('textarea').last().focus();
});

function addAnswer(element){
    $(element).parent().children('.answers').append('<div class="answer"><div><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" onclick="removeAnswer(this)" aria-hidden="true"></span></span><textarea class="form-control" rows="3"></textarea><span class="input-group-addon"><input type="checkbox" aria-label="..."></span></div></div></div>');
    $('a').last().focus();
}

function removeAnswer(element){
    $(element).parent().parent().remove();
    $('a').last().focus();
}