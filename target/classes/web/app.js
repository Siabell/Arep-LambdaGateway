
app = (function () {
    var numberU;
    var url= '';


    return {
        setNumber: function () {
            numberU = document.getElementById("txt_number").value;
            console.log(numberU)
        },
        showSquare: function (dataR) {
            $("#square").empty();
            $("#square").append('Square: ');
            $("#square").append(dataR.data.data);
            
        },

        getSquare: function () {   
            app.setNumber() 
            axios.get(url+'/calculator/'+numberU)
                .then(response => {
                    // Respuesta del servidor
                    console.log(response)
                    app.showSquare(response);
                    
                })
                .catch(e => {
                    // Capturamos los errores
                    console.log(e);
                })
            
        },
    };
})();
