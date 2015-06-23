$(document).ready(function() {
    $("#markItUp").markItUp(mySettings);
});
var countAnswers = 2;

$('.question-form').on('click','.glyphicon-remove',function(){
   $(this).parent().parent().remove();
});

$('.main-quest-panel').on('click','.add-qwest-button',function(){
 $('.questions').append('<form class="question-form"><div><textarea class="form-control" rows="3"></textarea></div><div class="answers"><div class="answer"><div class="col-lg-10"><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></span><textarea class="form-control" rows="3"></textarea><span class="input-group-addon"><input type="checkbox" aria-label="..."></span></div></div></div></div><div class="clear"></div><a onclick="addAnswer(this)" href="javascript:void(0)" class="btn btn-primary btn-raised add-ans-button">Add answer</a></form>');

    $('textarea').last().focus();
});



function addAnswer(element){
 $(element).parent().children('.answers').append('<div class="answer"><div class="col-lg-10"><div class="input-group"><span class="input-group-addon"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></span><textarea class="form-control" rows="3"></textarea><span class="input-group-addon"><input type="checkbox" aria-label="..."></span></div></div></div>');

    $('a').last().focus();
}