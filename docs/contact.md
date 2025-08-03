# Contact API Spec

## Create Contact

Endpoint: POST /api/contacts

Request Header :
- X-API-TOKEN: Token(Mandatory)

Request Body : 

```json
{
  "firstName": "Timothy",
  "lastName" : "Wowww",
  "email" : "timothy.test@gmail.com",
  "phone" : "080808080808"
}
```

Response Body (Success) : 

```json
{
  "data": {
    "id" : "random-string",
    "firstName": "Timothy",
    "lastName" : "Wowww",
    "email" : "timothy.test@gmail.com",
    "phone" : "080808080808"
  }
}
```

Response Body (Failed) :

```json
{
  "data":"Email format invalid"
}
```

## Update Contact

Endpoint: PUT /api/contacts/{idContact}

Request Header :
- X-API-TOKEN: Token(Mandatory)

Request Body :

```json
{
  "id" : "random-string",
  "firstName": "Timothy",
  "lastName" : "Wowww",
  "email" : "timothy.test@gmail.com",
  "phone" : "080808080808" 
}
```

Response Body (Success) :

```json
{
  "data": {
    "id" : "random-string",
    "firstName": "Timothy",
    "lastName" : "Wowww",
    "email" : "timothy.test@gmail.com",
    "phone" : "080808080808"
  }
}
```

Response Body (Failed) :

```json
{
  "data":"Email format invalid"
}
```

## Get Contact

Endpoint: GET /api/contacts/{idContact}

Request Header :
- X-API-TOKEN: Token(Mandatory)

Response Body (Success) :

```json
{
  "data": {
    "id" : "random-string",
    "firstName": "Timothy",
    "lastName" : "Wowww",
    "email" : "timothy.test@gmail.com",
    "phone" : "080808080808"
  }
}
```

Response Body (Failed) :

```json
{
  "data":"Contact is not found"
}
```

## Search Contact

Endpoint: GET /api/contacts

Request Param : 
- name : String, contact first name or last name, using like query optional
- phone : String, contact phone, using like query, optional
- email : String, contact email, using like query, optional
- page : Integer, start from 0, default 0
- size : Integer, default 10

Request Header :
- X-API-TOKEN: Token(Mandatory)

Response Body (Success) :
```json
{
  "data" : [
    {
      "id" : "random-string",
      "firstName": "Timothy",
      "lastName" : "Wowww",
      "email" : "timothy.test@gmail.com",
      "phone" : "080808080808"
    },
    {
      "id" : "random-string",
      "firstName": "Timothy",
      "lastName" : "Wowww",
      "email" : "timothy.test@gmail.com",
      "phone" : "080808080808"
    }
  ],
  "paging" : {
    "currentPage" : 0,
    "totalPage" : 10,
    "size" : 10
  }
}
```

Response Body (Failed) :

```json
{
  "data":"Unauthorized"
}
```

## Remove Contact
Endpoint: DELETE /api/contacts/{idContact}

Request Header :
- X-API-TOKEN: Token(Mandatory)

Request Body :

Response Body (Success) :
```json
{
  "data":"OK"
}
```

Response Body (Failed) :

