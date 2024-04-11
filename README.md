# Premisa
Un taller puede recibir distintos tipos de vehiculo (coches, motos, camiones, tractores o gruas), todos ellos tienen matricula color y marca. Cada tipo tendrá 5 piezas propias, que podrán marcarse como averiadas (true) o no (false). El programa debe permitirnos ingresar un vehiculo para su reparación, modificar datos de los vehículos que se encuentran en el taller (aquí se modificará también el estado de las piezas) y mostrar la informacion de un vehiculo que se encuentre en el taller.

# Características 
- Para la realización de este ejercicio se ha creado una superclase vehículo y las subclases coche, moto, camion, tractor y grua, que heredan de la anterior los atributos matrícula, color y marca. 
- El programa funciona a traves de una serie de menús con el imput del usuario.
- Se han creado unas funciones especiales para facilitar la recogida de input, con ellas se unifica el planteamiento de la pregunta al usuario y el scanner para recoger su respuesta en una sola linea.
- No se ha llevado a cabo un proceso de refactorización en el código, por lo que partes que podrían ser su propia función estan alojadas en el main.

# Preguntas del profesor 
**¿Puede existir una estructura de padre => hijo => hijo en una clase?**
Si, no hay motivo por lo que esto no pieda ser posible. Estaríamos ante un caso de herencia múltiple.

**¿Puede ocurrir que una clase herede de dos clases padre? ¿Por qué?**
En Java esto no es posible, una clase solo heredará de una superclase. Sin embargo, es posible que otros lenguas ofrezcan esta posibilidad.
