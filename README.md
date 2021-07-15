# Quotes

This repository is a simple Java applicaton that parses a JSON file containing an array of quote objects using GSON to display random quotes every time it runs and use Api to display quote

## Application Dependencies:
On your Java clone od this project, make sure you have the GSON dependecy implemented in your build.gradle file:


    dependencies {
      
    implementation 'com.google.code.gson:gson:2.8.5'

    }

    and import :
    import com.google.gson.Gson;
* import com.google.gson.stream.JsonReader;
* import java.io.FileNotFoundException;
* import java.io.FileReader;
* import java.util.Random;
* import java.io.BufferedReader;
* import java.io.IOException;
* import java.io.InputStreamReader;
* import java.net.HttpURLConnection;
* import java.net.URL;

## Assets:
* recentquotes.json

## How to run:
Running the main method will display a random quote from a JSON file under assets folder or display random quote
from Api.
