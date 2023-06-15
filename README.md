
# Busify-Android

Busify-Android is a mobile application developed as a part of [Busify](https://github.com/bsoc-bitbyte/busify). The app was built to help ease out the process of verifying the passengers boarding the bus and managing them.

## UI

[Demo UI](https://github.com/Adi8712/busify-android/assets/116958420/9e26500d-a97d-43f0-a2b4-9d9f6b9a19d7)

## Tech Stack

- Kotlin
	- Lifecycle: Observe Fragment lifecycles and handle UI states upon the lifecycle changes.
	- ViewModel: Caches state and persists through configuration changes. ViewModel also handles events and delegates them to other layers of the hierarchy.
	- DataBinding: Binds UI components in your layouts to data sources in your app using a declarative format rather than programmatically.

- [Dagger-Hilt](https://dagger.dev/hilt/): Handles dependency injection.

- Architecture
	- MVVM Architecture: Implemented using the DataBinding library released by Google. All modules are independent which improves the testability of each layer.
		- Model: Responsible for the abstraction of the data sources, also contains the business logic.
		- View: This layer informs the ViewModel about the user’s action.
		- ViewModel: Exposes those data streams which are relevant to the View. Acts as a connection between the View and the business logic.


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
