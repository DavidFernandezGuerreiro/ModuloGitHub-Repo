# ModuloGitHub-Repo
Plugin para crear un repositorio en GitHub desde NetBeans. Asignatura Contornos de desarrollo.

## Plugin de GitHub para NetBeans
Es un botón con el logo de GitHub, colocado en el menú de NetBeans. Al pulsar dicho botón crea un nuevo repositorio y pide el nombre que le quieres asignar al repositorio.

## Para instalar el plugin:
Hay que crear un fichero nbm. Y descargar el plugin.

Hacemos click derecho sobre el proyecto "ModuloGitHub" ->Properties ->Build ->Packaging.
-License: En licencese buscamos la ruta, en mi caso estaba dentro de la carpeta build, y añadimos el fichero.txt que se encuentra.
-Home Page: Página web del desarrollador.
-Athor: Nombre del desarrolador.

Y en ->Properties ->Display, le añadí una descripción de lo que hace el módulo.

### Creamos el archivo .NBM :
Hacemos click derecho sobre el proyecto "ModuloGitHub ->Create NBM.

### Instalar el archivo .NBM :
Hacemos click en ->Tools, ->Plugin. Dentro de la ventana "Plugin", vamos a ->Downloaded, click en el botón ->Add Plugins..., seleccionamos nuestro plugin y click en ->Install.
A continuación, aceptamos los terminos. ->Install. ->Continue. ->Finish.

Y ya estaría el módulo preparado para ser usado.
