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

        crear(){
            var url="JSP/Crear.jsp";
            
            document.getElementById("pag").src=url;
        },
        modificar(){
            var url="JSP/Modificar.jsp";
            
            document.getElementById("pag").src=url;
        },
        eliminar(){
            var url="JSP/Eliminar.jsp";
            
            document.getElementById("pag").src=url;
        }
    }

})



