# Kata 6 | IS2

Parecida a la [Kata 5](https://github.com/SkinnyDevi/is2-kata5), en esta kata creamos nuestra propia API.
La API implementada es simple para entender como crear una API en Java, donde creamos
dos endpoints: `/sum` y `/multiply`, con parametros `op1` y `op2` de tipo numericos,
donde estos endpoints calculan el resultado apropiado para cada uno y devuelven el resultado
en format JSON.

```
http://localhost:8080/multiply?op1=32&op2=2
```
```json
{"result": 32}
```

Usamos la dependencia Spark que nos ayudara a crear un web service y exponerlo en el puerto `:8080`