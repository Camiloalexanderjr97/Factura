const app = new Vue({
    el: '#app',
    data: {
        titulo: 'ola',
        frutas: [
            {nombre: 'pera', cantidad: 10}
        ],
        nuevaFruta: ''
    },

    methods: {

        crearCliente() {
            var url = "JSP/RegistrarCliente.jsp";
 
            document.getElementById("pag").src = url;
        },
        crearArticulo() { 
            var url = "JSP/RegistrarArticulo.jsp";
 
            document.getElementById("pag").src = url;
        },  
        crearFactura() {
            var url = "JSP/CrearFactura.jsp";
 
            document.getElementById("pag").src = url;
        }, 
        modificarF() { 
            var url = "JSP/Listar.jsp";  

            document.getElementById("pag").src = url;
        },
        eliminarF() {
            var url = "JSP/Eliminar.jsp";

            document.getElementById("pag").src = url;
        }
    }

})



