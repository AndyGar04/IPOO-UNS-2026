class TesterColor {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO VERIFICACIÓN DE LA CLASE COLOR ---");

        // 1. Prueba de Constructores y Validaciones
        Color colorPorDefecto = new Color();
        System.out.println("Color por defecto (Blanco esperado): " + colorPorDefecto.toString());

        Color colorValido = new Color(50, 100, 150);
        System.out.println("Color válido (50, 150, 100 esperado - Ojo al orden r, a, v): " + colorValido.toString());

        Color colorInvalido = new Color(300, -50, 120);
        System.out.println("Color inválido (Blanco esperado por salir del rango): " + colorInvalido.toString());

        // 2. Prueba de Comandos Variar (Límites Matemáticos)
        System.out.println("\n--- PRUEBA DE COMANDOS DE VARIACIÓN ---");
        Color colorPrueba = new Color(200, 50, 100);
        System.out.println("Color inicial: " + colorPrueba.toString());
        
        colorPrueba.variar(100);
        System.out.println("Variar +100 (El rojo debe topear en 255): " + colorPrueba.toString());
        
        colorPrueba.variarRojo(-300);
        System.out.println("Variar Rojo -300 (El rojo debe topear en 0): " + colorPrueba.toString());

        // 3. Prueba de Consultas Lógicas
        System.out.println("\n--- PRUEBA DE CONSULTAS ---");
        Color colorRojo = new Color(255, 0, 0);
        System.out.println("¿El color RGB(255, 0, 0) es rojo? " + colorRojo.esRojo());

        Color colorGris = new Color(128, 128, 128);
        System.out.println("¿El color RGB(128, 128, 128) es gris? " + colorGris.esGris());

        // 4. Prueba de Complemento, Copy y Clone
        System.out.println("\n--- PRUEBA DE CREACIÓN Y COPIA ---");
        Color colorBase = new Color(50, 200, 100);
        Color complemento = colorBase.complemento();
        System.out.println("Color base: " + colorBase.toString());
        System.out.println("Complemento esperado RGB(205, 155, 55): " + complemento.toString());

        Color colorClonado = colorBase.clone();
        System.out.println("¿Base y Clon son equivalentes (equals)? " + colorBase.equals(colorClonado));
        
        // Comprobar manejo de nulos exigido
        System.out.println("¿Equals contra un null da false sin romper el código? " + colorBase.equals(null));
        
        Color receptorCopy = new Color();
        receptorCopy.copy(colorBase);
        System.out.println("Color después de aplicar copy: " + receptorCopy.toString());
    }
}
