# $\_GET

Um array associativo de variáveis passadas para o script atual por meio dos parâmetros de URL (**query string**).

Exemplo de _URL https://exemplo.com/?name=Paschoal_:
```php
<?php

echo 'Olá' . htmlspecialchars($_GET["name"]) . '!';
\\ Olá Paschoal!
```

