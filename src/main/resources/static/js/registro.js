$(document).ready(function() {
	$('#ingresar').on('click', function () {

		var clave1 = $('#clave1').val();
		var clave2 = $('#clave2').val();

		if (clave1 != clave2) {
			$('#mensaje').attr('style', 'color:orange');
			$('#mensaje').text('¡La constraseñas no son iguales!');
		}
		else {
			$('#frmUsuario').submit();
		}

	});

});