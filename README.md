# ProgressButton_MotionLayout

ProgressButton implementation using MotionLayout

Original prototype [Dribbble link](https://dribbble.com/shots/1945593-Login-Home-Screen)

Checkout java library [Java library](https://github.com/muramrr/ProgressButton)

![](https://github.com/muramrr/ProgressButton_MotionLayout/blob/master/untitled1.gif)

### Overview

States decription used in motion scene:

* *Start* state is an initial button state with text **Done**;
* *Middle* state is a progress spinner state with "hidden" button;
* *Scale* state is a fullscreen background color scaled up from progress spinner;
* *End* state is responsible for hiding background fullscreen view and displaying some content laying behind.

### Usage

Transition animations can be handled by application states. 

As for example:

```kotlin
authViewModel.authState.observe(this, Observer { authStates ->

  when(authStates) {
    UNAUTHENTICATED -> //initial button state
    IN_PROGRESS -> motionContainer.transitionToState(R.id.middle)
    SUCCESS -> motionContainer.transitionToState(R.id.scaled)
    AUTHENTICATED -> motionContainer.transitionToState(R.id.end)
  }

})
```

Also, *end* state can be mixed up with your app logo or something like ***Hello, Username*** and after that just open your mainFragment/Activity etc.

### License

```License
Copyright (c) 2020 Andrii Kovalchuk

  Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.

You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and 
limitations under the License.
```
