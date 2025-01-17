# Currency Converter

This is an Android Currency Converter application built using Kotlin. It allows users to convert between different currencies by fetching real-time conversion rates from an external API.

## Features

- Fetches real-time currency rates.
- Converts currency amounts based on user input.
- Allows users to swap currencies quickly.
- Simple and intuitive user interface.

## Prerequisites

- Android Studio Arctic Fox or higher.
- Retrofit2 for API calls.
- Internet access for fetching currency data.

## Installation

1. Clone this repository to your local machine:
   ```bash
   https://github.com/DariusGovender/CurrencyConverter.git

2. Open the project in Android Studio.
3. Sync the Gradle files to ensure all dependencies are installed.
4. Add a Kotlin file in the api package and name it `apiKey.kt`
5. Add your API key in `apikEy.kt`:
    ```kotlin
    const val apiKey = <your_api_key_here>

6. Build and run the project on an Android device or emulator.

## Usage

- Select the currency to convert from using the "From Currency" dropdown.
- Select the currency to convert to using the "To Currency" dropdown.
- Enter the amount you want to convert in the "Amount" field.
- Press the "Convert" button to get the converted amount.
- Press the "Swap" button to quickly swap the selected currencies.

## Dependencies

- **Retrofit2** for making network requests.
- **Gson** for parsing JSON data.
- **AndroidX Libraries** for UI components and compatibility.

## API

This application uses a currency conversion API(getgeoapi) that provides real-time exchange rates. Visit https://currency.getgeoapi.com for access to this API KEY.

## UI Design Resources
Visit: https://www.figma.com/design/4WibmPbXNhiYxY1h7y4adc/UI-Design?node-id=0-1&t=DErnTCk2CjVyqcia-1

## Future Enhancements

- **Push notifications** to alert users when there are significant changes in exchange rates.

