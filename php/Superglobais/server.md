# $\_SERVER

$\_SERVER é um array contento informações como cabeçalhos, caminhos e locais de scripts.

As entradas nesses array são criadas pelo servidor web, portanto **não há garantias de que todo servidor web forneça qualquer uma delas**. Os servidores podem omitir ou fornecer outras não listadas aqui.

## Índices

'PHP\_SELF'
> O nome do arquivo do script em execução no momento, relativo a raiz do documento.

Exemplom de um script no endereço _https://exemplo.com/foo/bar.php_:
```php
echo $_SERVER['PHP_SELF'];
// /foo/bar.php
```

'argv'
> Matriz de argumentos passados para o script.

'argc'
> Contém o número de parâmetros de linha de comando passadas para o script (se executado na linha de comando).

'GATEWAY\_INTERFACE'
> Qual revisão da especificação CGI o servidor está usando: por exemplo 'CGI/1.1'. 

'SERVER\_ADDR'
> O endereço IP do servidor no qual o script atual está sendo executado

'SERVER\_NAME'
> O nome do host do servidor sob o qual o script atual está sendo executado. Se o script estiver sendo executado em um host virtual, este será o valor definido para esse hoste virtual.

'REQUEST\_METHOD'
> Contém o médoto de request utilizado para acessar a página. Geralmente "'GET', 'HEAD','POST','PUT'".

'QUERY\_STRING'
> A query string, se houver, pela qual a página foi acessada.

[Entre outros...](https://php.net/manual/pt_BR/reserved.variablas.server.php)













