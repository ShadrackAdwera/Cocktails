# Cocktails

An Android application for users to search for their favourite cocktails and displays them alongside the description and recipe.

#### By Shadrack Adwera

## Description

The application consumes thecocktaildb API whereby the JSON objects are converted into POJOs where data is stored. Coordinator layout is used to hold the child views since it provides many different interactions within a single parent and those views inside it can also interact with one another. A Nested scrollview is also used inside the layout in order to provide a smooth scrolling effect across the activity. Since cardviews provide storage for multiple types of data and also help improve user experience, the have been used to hold the objects for display within a custom adapter.

## Prerequisites

* You need to install the [Java SDK](https://sdkman.io/install) in order to create Java applications and the [Java Runtime Environment](https://sdkman.io/usage) which provides the requirements for executing a Java application.

* Android Studio is the preferred IDE for Google's Android OS. It needs to be [installed](https://developer.android.com/studio#downloads)

## Overview

* On loading the application, a splash screen then a log in page is displayed. A user is prompted to create an account if one does not exist, or alternatively sign in with google

     ![resize1](https://user-images.githubusercontent.com/25340965/75249441-631b0b00-57e7-11ea-98f3-53c2b6dca9d8.jpg) 
  
 * The sign up page with user name and password is displayed, once a user opts to chose that method of signing in
 
      ![resize2](https://user-images.githubusercontent.com/25340965/75249762-efc5c900-57e7-11ea-8517-d3dee0e4da37.jpg)

* After creating an account one is automatically signed in with the username displayed at the top

     ![resize3](https://user-images.githubusercontent.com/25340965/75250224-eab54980-57e8-11ea-858e-6b4f36bf4a5a.jpg)

* Clicking on a category passes an intent to open a custom fragment which displays the drinks under a category alongside their name

     ![resize4](https://user-images.githubusercontent.com/25340965/75250281-12a4ad00-57e9-11ea-91c6-601a860b9e6c.jpg)

* A drink and its details, including ingredients and instructions to prepare it can be viewed by clicking on the gridview item holding the drink. One can also add a certain drink to a list of favourites by clicking on the favourites button or share the drink on social media by clicking the share icon at the bottom.

     ![resize5](https://user-images.githubusercontent.com/25340965/75250363-4253b500-57e9-11ea-8614-1261fa6cb916.jpg)

* Favourite drinks can be viewed by clicking on the favourites link on top of the home page. A swipe to delete option has been enabled. A user can also reorder the list by dragging the list item and dropping it to a different index.

     ![resize6](https://user-images.githubusercontent.com/25340965/75250527-978fc680-57e9-11ea-908f-ff2d7dcc11b5.jpg)
     
 * A user can also search for any drink under any category using the search option at the top
 
     ![search](https://user-images.githubusercontent.com/25340965/75250737-1422a500-57ea-11ea-8051-c016bbfe7a92.jpg)

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
