# $\_POST

Um array associativo de variáveis passados para o script atual via método HTTP POST quando utilizado aplication/x-www-urlencoded ou miltipar/form-data como valor do cabeçalho HTTP Content-type na requisição.

```php

<form action="<?=htmlspecialchars($_SERVER['PHP_SELF'])?>" method"POST">
    <input type="text" name="name">
    <input type-"submit" value="enviar">
</form>
<p>
    <?= "Hello " . $_POST['name'] . "!"?>
</p>

<!-- Hello Paschoal! -->
```

