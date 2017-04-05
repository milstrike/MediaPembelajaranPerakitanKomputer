var Score = 0;
var AnswerRotation = 0;

function RightAnswer(){
    if(AnswerRotation > 0){
        alert("Anda tidak dapat mengubah jawaban lagi!");
    }
    else{
        alert("Jawaban Anda Benar!");
        Score = Score + 5;
        AnswerRotation = 1;
    }
}

function FalseAnswer(){
if(AnswerRotation > 0){
        alert("Anda tidak dapat mengubah jawaban lagi!");
    }
    else{
        alert("Jawaban Anda salah!");
        Score = Score - 5;
        AnswerRotation = 1;
    }
}

function clearAnswerRotation(){
    AnswerRotation = 0;
}

function setAnswerRotation(){
    AnswerRotation = 1;
}

function showResult(){
    var s= document.getElementById("skorResult");
    s.innerHTML = Score;
}

function resetScore(){
    Score = 0;
    AnswerRotation = 0;
}
