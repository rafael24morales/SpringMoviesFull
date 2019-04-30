$(document).ready(function(){
    getData();
    function getData(){
        $.getJSON("/pelicula",
        function(dataResult){
          var peliculasData = "";
          $.each(dataResult,function(key,value){
            peliculasData += '<tr>';
            peliculasData += '<td scope="row">'
                      + value.idPelicula + '</td>';
            peliculasData += '<td>'+ value.nombre + '</td>';
            peliculasData += '<td>'+ value.genero + '</td>';
            peliculasData += '<td>'+ value.duracion + '</td>';
            peliculasData += '<td>'+ value.clasificacion + '</td>';
            peliculasData += '</tr>';
          })
          $("#peliculasTable").append(peliculasData);
        });
    }

    $("#persistir").click(function(e){
        e.preventDefault();

      var url = "/pelicula";
      var data = {
          nombre : $("#inputNombre").val(),
          genero :  $("#inputGenero").val(),
          duracion : $("#inputDuracion").val(),
          clasificacion : $("#inputClasificacion").val()
      }
      $.ajax({
          type:"POST",
          contentType: "application/json; charset=utf-8",
          url:url,
          data: JSON.stringify(data),
          dataType: "json"
      });
      resetData();
      getData();
    })

    function resetData(){
        $("#inputNombre").val("");
        $("#inputGenero").val("")
        $("#inputDuracion").val("")
        $("#inputClasificacion").val("")
    }

    })

