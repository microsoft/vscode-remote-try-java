Pruebe los contenedores de desarrollo: Java
Un contenedor de desarrollo es un contenedor Docker en ejecución con una pila de herramientas / tiempo de ejecución bien definida y sus requisitos previos. Puede probar contenedores de desarrollo con GitHub Codespaces o Visual Studio Code Remote - Containers .

Este es un proyecto de muestra que le permite probar cualquiera de las opciones en unos sencillos pasos. También tenemos una variedad de otros proyectos de muestra de vscode-remote-try- * .

Nota: Si ya tiene un espacio de código o un contenedor de desarrollo, puede saltar a la sección Cosas para probar .

Configurar el contenedor de desarrollo
Espacios de códigos de GitHub
Siga estos pasos para abrir esta muestra en un espacio de código:

Haga clic en el menú desplegable Código y seleccione la opción Abrir con espacios de código .
Seleccione + Nuevo espacio de código en la parte inferior del panel.
Para obtener más información, consulte la documentación de GitHub .

VS Code Remote - Contenedores
Siga estos pasos para abrir esta muestra en un contenedor usando la extensión VS Code Remote - Containers:

Si es la primera vez que usa un contenedor de desarrollo, asegúrese de que su sistema cumpla con los requisitos previos (es decir, tenga Docker instalado) en los pasos de introducción .

Para usar este repositorio, puede abrir el repositorio en un volumen Docker aislado:

Presione F1y seleccione el comando Contenedores remotos: Pruebe una muestra ...
Elija la muestra "Java", espere a que se inicie el contenedor y pruebe las cosas.
Nota: Bajo el capó, esto usará el comando Remote-Containers: Clone Repository in Container Volume ... para clonar el código fuente en un volumen Docker en lugar del sistema de archivos local. Los volúmenes son el mecanismo preferido para conservar los datos del contenedor.

O abra una copia clonada localmente del código:

Clone este repositorio en su sistema de archivos local.
Presione F1y seleccione el comando Contenedores remotos: Abrir carpeta en contenedor ...
Seleccione la copia clonada de esta carpeta, espere a que se inicie el contenedor y pruebe las cosas.
Cosas para probar
Una vez que haya abierto esta muestra, podrá trabajar con ella como lo haría localmente.

Nota: este contenedor se ejecuta como un usuario no root con acceso sudo de forma predeterminada. Comentar "remoteUser": "vscode"en .devcontainer/devcontainer.jsonsi prefiere ejecutar como root.

Algunas cosas para probar:

Editar:
Abrir src/main/java/com/mycompany/app/App.java.
Intente agregar un código y verifique las características del idioma.
Tenga en cuenta que el paquete de extensión de Java ya está instalado en el contenedor ya que las .devcontainer/devcontainer.jsonlistas "vscjava.vscode-java-pack"como una extensión para instalar automáticamente cuando se crea el contenedor.
Terminal: presione Ctrl+ Shift+ `y escriba unamey otros comandos de Linux desde la ventana del terminal.
Compilar, ejecutar y depurar:
Abrir src/main/java/com/mycompany/app/App.java.
Agrega un punto de interrupción.
Presione F5para iniciar la aplicación en el contenedor.
Una vez que se alcanza el punto de interrupción, intente desplazarse sobre las variables, examinar los locales y más.
Ejecutar una prueba:
Abrir src/test/java/com/mycompany/app/AppTest.java.
Ponga un punto de ruptura en una prueba.
Haga clic Debug Testen en la lente de código sobre la función y observe cómo llega al punto de interrupción.
Contribuyendo
Este proyecto agradece contribuciones y sugerencias. La mayoría de las contribuciones requieren que acepte un Acuerdo de licencia de colaborador (CLA) que declara que tiene derecho a otorgarnos, y que realmente lo hace, los derechos para utilizar su contribución. Para obtener más información, visite https://cla.microsoft.com .

Cuando envíe una solicitud de extracción, un CLA-bot determinará automáticamente si necesita proporcionar un CLA y decorar el PR de manera adecuada (por ejemplo, etiqueta, comentario). Simplemente siga las instrucciones proporcionadas por el bot. Solo necesitará hacer esto una vez en todos los repositorios usando nuestro CLA.

Este proyecto ha adoptado el Código de conducta de código abierto de Microsoft . Para obtener más información, consulte las preguntas frecuentes sobre el Código de conducta o póngase en contacto con opencode@microsoft.com si tiene preguntas o comentarios adicionales.

Licencia
Copyright © Microsoft Corporation Todos los derechos reservados.
Licenciado bajo la licencia MIT. Consulte LICENCIA en la raíz del proyecto para obtener información sobre la licencia.
