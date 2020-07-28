# Car Fleet Project

This example is for visualizing and managing a car fleet using Aerospike + Spring Boot Integration. Really can be used for any connected device fleet / collection. Provides following REST API -

- `GET - /fleet/cars` returns the list of Cars from the Aerospike Instance running as a Docker container
- `POST - /fleet/cars` returns the list of Cars and creates the Car which we post.
- Sample data :  `{
        "vin": "3XDFL906",
        "brand": "Porsche",
        "model": "Carrera",
        "battery": 100,
        "zipCode": 94304,
        "coordinates": "(37.445099, -122.160362)"
    }`

## Applications 
    Capacity Planning - To manage capacity of recharge stations
    Monitoring - To monitor the cars and report status
    Notifications - To notify owners and agency of impending problems

## Technologies explored
    Docker
    Aerospike, AMC, Aerospike Tools Docker Container(s)
    Spring Boot
    REST API

## Aerospike Management Console - test namespace
![Alt text](amc1.png?raw=true "AMC")

![Alt text](amc.png?raw=true "AMC")

## Aerospike Query Language - sample data
![Alt text](aql.png?raw=true "AMC")

![Alt text](aql1.png?raw=true "AMC")

## Current Fleet REST Response

![Alt text](fleet.png?raw=true "Car Fleet")

## Further Development
    Enhance data models
    Build other data models
    Use Telemetry Data and corresponding integration(s)