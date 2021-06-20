# Proyecto de Control de Actividades (Tracking) :hourglass_flowing_sand:
Tracking es una aplicación de control de actividades, en el que nos ayudará a tener un mejor manejo diario de las metas que se desea realizar en el día.
Este Tracking nos permitirá llevar un registro en una base de datos de cada uno de los objetivos que fueron agregados, se mostrará la meta que se insertó, la fecha con su respectiva hora y si se logró cumplir con lo deseado.

A continuación, se les mostrará un grafico en base a UML del proyecto del control de actividades:

![Image text](https://github.com/Laura27-89/Project/blob/main/src/com/ucreativa/imagenes/UML_Tracking.jpg)

Como podemos observar la clase **Actividad** es la clase padre y hereda sus atributos (meta, prioridad, duracion, animo) a sus descendientes **Estudio y Personal**.

<ins>Intenciones de los atributos de la clase padre Actividad</ins>:
* meta: Se agregará uno o mas objetivos  que desea cumplir en el día.
* prioridad: Se le indicará de que nivel de importancia de dicho objetivo.
* duracion: Se determinará cuanto tiempo se duró en los objectivos.
* animo: Se podrá comentar el ánimo de haber realizado las metas.

Se utilizó los métodos **get** para que los atributos se muestren y el método **set** para modificar los atributos que pueden llegar a cambiar en ciertos momentos.

![Image text](https://github.com/Laura27-89/Project/blob/main/Actividad.jpg)

En seguida podemos ver que en la clase "Estudio" se le agregaron dos atributos mas (materia, tarea), sin eliminar ni modificar los atributos que la clase "Actividad" le heredo.

<ins>Propósito de los atributos de la clase Estudio</ins>:
* materia: Se indica el tema del proyecto de estudio.
* tarea: Se comenta cuál es la intención del estudio (repaso, examen, tarea etc.)

![Image text](https://github.com/Laura27-89/Project/blob/main/Estudio.jpg)

La clase Personal al igual que Estudio se le añadieron dos atributos más (ejercicio, hogar) aparte de los que la clase padre (Actividad) le heredó.

<ins>Propósito de la clase Personal</ins>:
* ejercicio: Se le agregará los datos del tipo de ejercicios que se realizó (pesas, cardio, caminar, etc.)
* hogar: Se comentará que labores del hogar o personales se efectuó.

![Image text](https://github.com/Laura27-89/Project/blob/main/Personal.jpg)

Por último vamos analizar la clase BitacoraTracking, dicha clase no esta ligada o relacionada directamente de la clase padre Actividad, por eso observamos que no esta heredando ningún atributo, así teniendo sus propios atributos que serán agregados en el registro como información adicional a los atributos anteriores.
Se utilizó los métodos **get** para que los atributos se muestren.

<ins>Propósito de la clase BitacoraTracking</ins>:
* actividad: En este atributo se llamara la clase padre **Actividad** para que los datos se lleguen a relacionar.
* fecha: Java proporciona una clase de fecha bajo el paquete java.util, así es cómo obtendremos la fecha actual.
* realizado: Es un atributo de tipo de dato, en donde se llama boolean y puede almacenar unicamente dos valores: verdadero o falso. Es decir que en esta opción se seleccionará si la meta se cumplió o no.

![Image text](https://github.com/Laura27-89/Project/blob/main/BT.jpg)







