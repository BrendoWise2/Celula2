let machineId = null; // Variável para armazenar o ID da parada
let btnSalvar = document.querySelector('#salvarButton');
let celulaSelecionada, operatorName;
let startHour, endHour, totalTime;
let startDate, endDate, ge;


btnSalvar.addEventListener('click', function () {

    operatorName = document.getElementById('operator').value.trim();
    celulaSelecionada = document.getElementById('celulas').value.trim();
    startHour = document.getElementById('startHour').value.trim();
    endHour = document.getElementById('endHour').value.trim();
    startDate = document.getElementById('startDate').value.trim();
    endDate = document.getElementById('endDate').value.trim();
    totalTime = document.getElementById('totalTime').value.trim();

    // Agora sim: valida
    if (!operatorName || !celulaSelecionada || !startHour || !endHour || !startDate || !endDate || !totalTime) {
        alert("Preencha todos os campos!");
        return;
    }

    if (confirm("Voce realmente deseja salvar!")) {
        salvarEquipamento();
        disabledBnt();
    }


});

function disabledBnt() {
    btnSalvar.disabled = true;
    btnSalvar.classList.add('desativado');
}


function salvarEquipamento() {

    fetch("http://localhost:8080/celula/salvar", {
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            operatorName: operatorName,
            celulaSelecionada: celulaSelecionada,
            startHour: startHour,
            endHour: endHour,
            totalTime: totalTime,
            startDate: startDate,
            endDate: endDate,

        })



    })
        .then(response => response.json())
        .then(data => {
            console.log("Dados enviados com sucesso:", data);
        })
        .catch(error => {
            console.error("Erro ao enviar os dados:", error);
        });

}



