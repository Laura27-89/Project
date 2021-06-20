# Proyecto de Control de Actividades (Tracking) :hourglass_flowing_sand:
Tracking es una aplicación de control de actividades, en el que nos ayudará a tener un mejor manejo diario de las metas que se desea realizar en el día.
Este Tracking nos permitirá llevar un registro en una base de datos de cada uno de los objetivos que fueron agregados, se mostrará la meta que se insertó, la fecha con su respectiva hora y si se logró cumplir con lo deseado.

A continuación, se les mostrará un grafico en base a UML del proyecto del control de actividades:

![Image text](https://github.com/Laura27-89/Project/blob/main/UML_Tracking.jpg)

Como podemos observar la clase **Actividad** es la clase padre y hereda sus atributos (meta, prioridad, duracion, animo) a sus descendientes **Estudio y Personal**.

Intenciones de dichas clases:
* meta: Se agregará uno o mas objetivos  que desea cumplir en el día.
* prioridad: Se le indicará de que nivel de importancia de dicho objetivo.
* duracion: Se determinará cuanto tiempo se duró en los objectivos.
* animo: Se podrá comentar el ánimo de haber realizado las metas.

Se utilizó los métodos **get** para mostrar los atributos y el método **set** para modificar los atributos que pueden llegar a cambiar en ciertos momentos.

![Image text](https://github.com/Laura27-89/Project/blob/main/UML_Tracking.jpg)


