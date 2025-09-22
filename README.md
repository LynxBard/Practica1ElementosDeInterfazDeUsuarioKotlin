# Practica 1. Instalación y Funcionamiento de los Entornos Móviles
## Ejercicio 2: Transiciones entre Activities y Fragments con Kotlin
Alumno: Gonzalez Sanchez Carlos David
## Descripción de la App

Esta aplicación para Android sirve como demostración de varios elementos de la interfaz de usuario comunes en el desarrollo de Android. Permite a los usuarios interactuar y ver el comportamiento de componentes como botones, campos de texto, controles de selección (casillas de verificación, botones de radio, interruptores), listas y otros elementos de información.

El objetivo principal de esta aplicación es crear una aplicación Android que demuestre el uso de Activities y Fragments para explicar diferentes elementos de interfaz de usuario.

## Instrucciones de Uso del Proyecto

Para utilizar este proyecto, sigue estos pasos:

1.  **Clonar el Repositorio:**
    *   Si el proyecto está alojado en un repositorio Git (por ejemplo, GitHub, GitLab), clónalo a tu máquina local usando el comando `git clone <url_del_repositorio>`.
    *   Si has recibido el proyecto como un archivo ZIP, descomprímelo en la ubicación deseada.

2.  **Abrir en Android Studio:**
    *   Abre Android Studio.
    *   Selecciona "Open an existing Android Studio project" (Abrir un proyecto existente de Android Studio) o "File" > "Open..." (Archivo > Abrir...).
    *   Navega hasta el directorio raíz del proyecto clonado/descomprimido (la carpeta `Tarea1_ElementosInterfaz`) y selecciónalo.
    *   Android Studio comenzará a sincronizar el proyecto con Gradle. Espera a que este proceso finalice. Puede que necesites conexión a internet para descargar las dependencias necesarias.

3.  **Configurar un Emulador o Dispositivo Físico:**
    *   **Emulador:**
        *   En Android Studio, ve a "Tools" > "AVD Manager" (Herramientas > Administrador de AVD).
        *   Crea un nuevo Dispositivo Virtual Android (AVD) si no tienes uno configurado, o elige uno existente. Asegúrate de que tenga una imagen de sistema compatible (por ejemplo, Android API 21 o superior).
    *   **Dispositivo Físico:**
        *   Habilita las "Opciones de desarrollador" y la "Depuración por USB" en tu dispositivo Android.
        *   Conecta tu dispositivo a la computadora mediante un cable USB.
        *   Autoriza la depuración USB en tu dispositivo si se te solicita.

4.  **Ejecutar la Aplicación:**
    *   Una vez que el proyecto esté sincronizado y tengas un emulador en ejecución o un dispositivo conectado, selecciónalo desde el menú desplegable de dispositivos en la barra de herramientas de Android Studio (generalmente al lado del botón de "Run" o "Debug").
    *   Haz clic en el botón "Run" (el ícono de triángulo verde) o selecciona "Run" > "Run 'app'" en el menú.
    *   Android Studio compilará el proyecto, lo instalará en el dispositivo/emulador seleccionado y lo iniciará.

5.  **Explorar la Aplicación:**
    *   Una vez que la aplicación se inicie, podrás navegar a través de las diferentes secciones para interactuar con los elementos de la interfaz de usuario implementados.

**Fragment 1: TextFields (EditText)** 
<br>
<img width="382" height="848" alt="image" src="https://github.com/user-attachments/assets/71b40d53-aa6b-4069-9ab0-247b0ba19e34" />
<br>
**Fragment 2: Botones (Button, ImageButton)**
<br>
<img width="340" height="754" alt="image" src="https://github.com/user-attachments/assets/6da79a02-4dcd-407d-8cc6-6e895d084edc" />
<br>
**Fragment 3: Elementos de selección (CheckBox, RadioButton, Switch)**
<br>
<img width="374" height="830" alt="image" src="https://github.com/user-attachments/assets/8b6cd7f5-5450-4a4f-ae4f-559a23afc806" />
<br>
**Fragment 4: Listas (RecyclerView o ListView)**
<br>
| Vista Principal de la Lista | Detalle al Seleccionar un Elemento |
| :---: | :---: |
| <img width="344" height="764" alt="image" src="https://github.com/user-attachments/assets/ddf919a0-a8b2-4c0f-a28e-00dea0fec497" /> | <img width="343" height="761" alt="image" src="https://github.com/user-attachments/assets/94639bcc-db45-4117-a472-1e610c8d15b9" /> |
<br>
**Fragment 5: Elementos de información (TextView, ImageView, ProgressBar)**
<br>
| Estado Inicial | Indicador de Progreso Activo |
| :---: | :---: |
| <img width="372" height="826" alt="image" src="https://github.com/user-attachments/assets/ddbe7fb7-a9e9-4b14-99e9-5968dab7f56c" /> | <img width="372" height="826" alt="image" src="https://github.com/user-attachments/assets/c87bc6c8-6c09-443e-9683-d1ec694a6e0d" /> |
<br>

