Elementos básicos de JavaFX y su relación con POO
En esta actividad se reconocen los elementos básicos de JavaFX y su relación con conceptos de Programación Orientada a Objetos (POO), mediante una aplicación gráfica sencilla.
----
¿Qué es JavaFX?
JavaFX es un framework de Java para crear interfaces gráficas de usuario (GUI). Sucesor de Swing, permite construir aplicaciones de escritorio con ventanas, controles visuales (botones, campos de texto, etc.), estilos personalizables (mediante CSS) y manejo de eventos. Como toda librería de Java, está compuesta enteramente por clases y objetos, lo cual la conecta directamente con los principios de POO.

Los cuatro pilares estructurales: Application, Stage, Scene y Node
Estos cuatro elementos forman una jerarquía que define cómo se organiza cualquier aplicación JavaFX:

Elemento	Qué es	Analogía
Application	Clase abstracta que toda aplicación JavaFX debe extender. Obliga a implementar el método start(Stage primaryStage), punto de entrada de la app.	El "director" de la obra
Stage	Representa la ventana de la aplicación (el contenedor de más alto nivel).	El teatro/escenario físico
Scene	Representa el contenido que se muestra dentro del Stage en un momento dado. Un Stage puede cambiar de Scene, pero solo muestra una a la vez.	La "escena" de una obra dentro del teatro
Node	Es la clase base abstracta de todo elemento visual (botones, textos, imágenes, layouts). Todo lo que se ve en pantalla es, en el fondo, un Node.	Los actores y objetos sobre el escenario

----
Código en java

<img width="1944" height="848" alt="image" src="https://github.com/user-attachments/assets/15e56221-1550-4f54-866f-dc37735b964e" />

---
Controles
Los controles son los componentes interactivos con los que el usuario se comunica con la aplicación: Button, Label, TextField, CheckBox, ComboBox, RadioButton, etc. Todos son subclases de Node (heredan de Control, que a su vez hereda de Node), lo cual es un ejemplo directo de herencia en acción.

Layouts (contenedores)
Los layouts son clases que organizan visualmente a otros nodos dentro de la ventana. Ejemplos comunes:

VBox — organiza elementos en una columna vertical
HBox — organiza elementos en una fila horizontal
BorderPane — divide el espacio en top, bottom, left, right y center
GridPane — organiza en una cuadrícula de filas y columnas
StackPane — apila elementos uno sobre otro
Un layout también es un Node (específicamente hereda de Pane), y a la vez contiene otros Node dentro de sí — esto ilustra el patrón de diseño Composite, muy típico en POO: un objeto contenedor que agrupa y gestiona a otros objetos del mismo tipo base.

Eventos y setOnAction()
Un evento es una acción del usuario sobre la interfaz (clic, tecla presionada, movimiento del mouse). JavaFX maneja eventos mediante el patrón listener/callback.

El método setOnAction() se usa típicamente en controles como Button para definir qué código se ejecuta cuando ocurre la acción (por ejemplo, un clic):

---
Método en java

<img width="1944" height="438" alt="image" src="https://github.com/user-attachments/assets/92ff0b0d-ae45-4872-8594-00377c68989c" />

---
Internamente, setOnAction() recibe un objeto que implementa la interfaz funcional EventHandler<ActionEvent>. La expresión lambda evento -> {...} es simplemente una forma abreviada de implementar esa interfaz — lo que conecta este mecanismo con el concepto de interfaces en POO.

## Relación general con POO
Concepto POO	Cómo se manifiesta en JavaFX
Clases y objetos	Cada elemento visual (Button, Scene, Stage) es un objeto instanciado de una clase
Herencia	Application es una clase abstracta que se extiende; todos los controles y layouts heredan de Node
Polimorfismo	Un Node puede ser tratado genéricamente sin importar si es un Button, un Label o un VBox
Encapsulamiento	Los atributos internos de cada control se acceden mediante métodos get/set (ej. getText(), setText())
Interfaces	EventHandler es una interfaz funcional que define el contrato para manejar eventos
Composición	Los layouts contienen y gestionan colecciones de otros nodos (patrón Composite)
En resumen: JavaFX no es solo una herramienta gráfica, sino una aplicación práctica y completa de los principios de POO — cada ventana, botón y evento que se ve en pantalla es resultado de objetos que heredan, se comunican y colaboran entre sí siguiendo esos principios.


