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
