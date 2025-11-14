<h1 align="center" style="font-weight: bold;">Security 💻</h1>



 <p align="center">
    <b>Autenticação e autorização com Spring Security</b>
</p>

<h2 id="technologies">💻 Technologies</h2>

- Java
- Spring Boot
- Spring Security
- PostgreSQL



<h2 id="routes">📍 API Endpoints</h2>


​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>POST /auth/register</kbd>  | registra um novo usuario.
| <kbd>POST /auth/login</kbd>     | faz o login de um usuario ja cadastrado.
| <kbd>GET /test</kbd>            | endpoint para teste.


<h3 id="get-auth-detail">POST /auth/register</h3>

**REQUEST**
```json
{
  "name":"Arthur",  
  "email":"arthur@gmail.com",
  "password":"555555"
}
```

**RESPONSE**
```json
{
  "name":"Arthur",  
  "email":"arthur@gmail.com"
}
```

<h3 id="post-auth-detail">POST /auth/login</h3>

**REQUEST**
```json
{
   "email":"arthur@gmail.com",
   "password":"555555"
}
```

**RESPONSE**
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInN1YiI6ImFydGh1ckBnbWFpbC5jb20iLCJleHAiOjE3NjMyMTgwMDEsImlhdCI6MTc2MzEzMTYwMX0.XxHUV2SONd4YdpSTOGsnT0NM1pXJDk3929JnZHR061A"
}
```

<h3 id="get-auth-detail">GET /test</h3>

**RESPONSE**
```json
  "testando a segurança"
```
