class MyAssistant {
    static consultar() {
        console.log("Estamos en el metodo consultar.");
        fetch("Computadora",
                {method: "GET"});

    }
    static main() {
        document.querySelector("#consultarBtn").setAttribute("onclick", "MyAssistant.consultar();");
    }

}
MyAssistant.main();
