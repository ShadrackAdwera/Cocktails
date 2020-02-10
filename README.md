# Cocktails

An Android application for users to search for their favourite cocktails and displays them alongside the description and recipe.

#### By Shadrack Adwera

## Description

The application consumes thecocktaildb API whereby the JSON objects are converted into POJOs where data is stored. Coordinator layout is used to hold the child views since it provides many different interactions within a single parent and those views inside it can also interact with one another. A Nested scrollview is also used inside the layout in order to provide a smooth scrolling effect across the activity. Since cardviews provide storage for multiple types of data and also help improve user experience, the have been used to hold the objects for display within a custom adapter.

## Prerequisites

* You need to install the [Java SDK](https://sdkman.io/install) in order to create Java applications and the [Java Runtime Environment](https://sdkman.io/usage) which provides the requirements for executing a Java application.

* Android Studio is the preferred IDE for Google's Android OS. It needs to be [installed](https://developer.android.com/studio#downloads)

## Overview

* On loading the application, a splash screen then the homepage is displayed

     ![resize1](https://user-images.githubusercontent.com/25340965/74100637-5be6d280-4b42-11ea-8ca7-244ac4c92d15.jpg)

* On click of the button at the bottom, an explicit intent is passed to open the next activity where popular cocktails and different drink categories are displayed

     ![resize2](https://user-images.githubusercontent.com/25340965/74100651-791ba100-4b42-11ea-99a4-ce9a8ada38a4.jpg)

* Clicking on a category passes an intent to open a custom fragment which displays the drinks under a category alongside their name

     ![resize3](https://user-images.githubusercontent.com/25340965/74100663-9486ac00-4b42-11ea-8169-b1173920f0af.jpg)

* A drink and its details, including ingredients and instructions to prepare it can be viewed by clicking on the card holding the drink

     ![resize4](https://user-images.githubusercontent.com/25340965/74100689-c13ac380-4b42-11ea-8afc-659cce2932fe.jpg)

* An implicit intent is used to share a drink name, its recipe and how to prepare it on social media.

     ![resize5](https://user-images.githubusercontent.com/25340965/74100699-cf88df80-4b42-11ea-8fe9-0a3d9246bf22.jpg)

## Installation

* Fork then clone the project on your machine, open in Android Studio then run the application on your emulator or android device.

## Technologies Used:

* **Gradle** - to manage and download dependencies.

* **Picasso** - to load images into the application by offering automatic memory and disk caching.

* **Retrofit** - to manage the process of sending and receiving HTTP requests.

* **OKHTTP3** - to allow all requests to share a socket. This created Connection pooling hence reduces request latency.

* **Postman** - to test the API endpoints.

* **jsonSchema2pojo** - to generate java classes from the json objects  

* **ButterKnife** - to Annotate fields with @BindView and a view ID to find and automatically cast the corresponding view in the layout.

* **Android Studio** - to develop the application.

## Known Bugs

* Incase any bug is found, or a request for a new functionality is needed, kindly open an issue [here](https://github.com/ShadrackAdwera/Cocktails/issues/new)

## Support and contact details

Feel free to contribute to the project by:

* Forking the repo
* Create a new branch (git branch my-contribution)
* Move to your branch (git checkout my-contribution)
* Make the changes in the files
* Add changes to reflect the changes made
* Commit your changes (git commit -m "Added features")
* Push to the branch (git push origin my-contriution)
* Create a Pull Request

Incase of any feedback/comments feel free to contact me at adweshshaddie@gmail.com

### License

#### Copyright (c) 2020 Shadrack Adwera

#### Licenced under the [MIT License](LICENSE)
