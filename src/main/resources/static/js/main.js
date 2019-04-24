$(document).ready(function(){

    $.getJSON("/pelicula",
    function(dataResult){
      var peliculasData;
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
    })
})
