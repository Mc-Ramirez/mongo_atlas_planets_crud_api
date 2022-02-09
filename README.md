
# iPlanet API

This is an API created for add, get and delete planets from a database on Mongo Atlas.
Still on localhost but we are pending to deploy it on heroku.




## API Documentation

#### Get all items

```http
  GET http://localhost:8080/getAllPlanets
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `getAllPlanets` | `string` | Return all the planets saved on the database |

#### Get item

```http
  POST http://localhost:8080/addPlanet
```
 **POST Body**
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `planetName`| `string` | **Required**. The name of the planet you want to add |
| `planetDistance`| `int` | **Required**. Distance to the sun, on kilometers |
| `planetEquatorialRadius`| `int` | **Required**. Distance of the equatorial radius of the planet |
| `planetRotationPeriod`| `int` | **Required**. The time it takes for the planet to rotate |
| `planetMassKg`| `long` | **Required**. The mass of the planet |
| `planetDensity`| `int` | **Required**. The density of the planet |
| `category`| `String` | **Required**. The category for the planet (star, planet, moon) |
| `planetUrlImage`| `String` | **Required**. The URL of an image you want to display for that planet |

