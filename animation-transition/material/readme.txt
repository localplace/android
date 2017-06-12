MATERIAL DESIGN - THEORY

28-05-2017

android.view.animation :- move, scale,  fade animations
use xml to define animations.

animationset, alpha and translate functions can be used 


Animations 3.0 and 4.0

chain many calls animate , like a builder pattern , compact code  :- ViewAnimator, Object Animator.

-------------------------------------------------------

android 4.4 :- Scene and Transistion API (example slide, explode etc )


two scenes, 2 xmls , and use transitionmanager for scene transitions


---------------------------------------------------------

android 5.0 

1)Activity transition

a) content transition :- how indivduals views exit and enter the transition

b) shared element transition :- element is shared between 2 screens and transitions between them.

----------------------------------------------------------

Content Transitions

Animate the views within the activity

Activity
A  (Exit Transition on A) --->  B (Enter Transition on B)


code versus xml :- xml can be reused.

we can have exit, enter, reneter and return trnasitions set


---------------------------------------------------------

Shared Element Transitions

same transition name attribute. use makescenetransitions api , sharedview, sharedviewgettransition. shared element have built in transitions called move.xml. 

--------------------------------------------------------

Project :- Content Transition

Project :- Shared Element Transition



