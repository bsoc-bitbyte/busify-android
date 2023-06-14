
# Busify-Android

Busify-Android is a mobile application developed as a part of [Busify](https://github.com/bsoc-bitbyte/busify). The app was built to help ease out the process of verifying the passengers boarding the bus and managing them.

## UI

[Demo UI](https://github.com/Adi8712/busify-android/assets/116958420/65d1e0a4-decd-4704-898d-5892af40fc8d)

## Tech Stack

- Kotlin
    - Lifecycle: Observe Fragment lifecycles and handle UI states upon the lifecycle changes.
    - ViewModel: Manages UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
    - DataBinding: Binds UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
- XML
    - RecyclerView: Displays all the bus schedules fetched through the api call
- [Dagger-Hilt](https://dagger.dev/hilt/): Handles dependency injection.

- Architecture
    - MVVM Architecture (View - DataBinding - ViewModel - Model)

## Features

- Browse through a list of scheduled buses
- Tap on a CardView to open the corresponding passenger list
- Scan a passengers ticket to confirm their boarding
- Toggle passengers name to check who's present

To summarize, the plan involves developing a user-friendly client app alongside the [Busify](https://github.com/bsoc-bitbyte/busify) project to revamp the entire bus ticket booking system.

## Installation

1. Fork this repository.
2. Clone the repository:

```bash
git clone https://github.com/bsoc-bitbyte/busify-android.git
```
3. Open the project in Android Studio.

4. Build and run the app on your connected device using Android Studio.

Note: Make sure you have the necessary dependencies and Android SDK installed to build and run Android apps.
