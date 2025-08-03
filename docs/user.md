# User API Spec

## Register User

Endpoint : POST /api/users

Request Body :

```json
{
  "username": "timo",
  "password" : "rahasia",
  "name" : "timo timo"
}
```

Response Body(Success) : 

```json
{
  "data" : "OK"
}
```

Response Body(FAILED) :

```json
{
  "data" : "KO",
  "errors" : "Username must not blank, ??"
}
```


## Login User

Endpoint : POST /api/auth/login

Request Body :

```json
{
  "username": "timo",
  "password" : "rahasia"
}
```

Response Body(Success) :

```json
{
  "data" : {
    "token": "TOKEN",
    "expiredAt" : 23232323232 //milisecond
  }
}
```

Response Body(Failed, 401) :

```json
{
  "errors" : "username or password wrong"
}
```

## Get User
Endpoint : GET /api/users/current

Request Header : 
- X-API-TOKEN: Token(Mandatory)

Response Body(Success) :

```json
{
  "data" : {
    "username": "timo",
    "name" : "timo"
  }
}
```

Response Body(Failed, 401) :

```json
{
  "errors" : "Unauthorized"
}
```

## Update User

Endpoint : PATCH /api/users/current

Request Header :
- X-API-TOKEN: Token(Mandatory)

Request Body : 
```json
{
  "name" : "timo", //put if only want to update name
  "password" : "rahasia", //put if only want to update password
}
```

Response Body(Success) :

```json
{
  "data" : {
    "username": "timo",
    "name" : "timo"
  }
}
```

Response Body(Failed, 401) :

```json
{
  "errors" : "Unauthorized"
}
```

## Logout User

Endpoint : DELETE /api/auth/logout

Request Header :
- X-API-TOKEN: Token(Mandatory)

Response Body (Success): 
```json
{
  "data" : "OK"
}
```