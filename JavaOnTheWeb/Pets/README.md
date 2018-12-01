# Pets!
Your company has been asked to make a prototype for PetIntelligence. They want children that come into the store to be able to fill out some information about their pet and see how that pet might interact with them.

The company wants the children to be able to see the results for both cats and dogs. This means that they see them as separate enough that they would like two separate URIs (/dog and /cat) for the two results; in the future, they will build out a different set of features for the two pages.

Your PM says that you need to make an animal model that has a name, breed, and weight for both the cat and dog to inherit. She says that if this contract gets bigger, the code you develop will be easy to understand and more importantly, easy to scale.

She also wants you to create a pet interface that contains only the method showAffection; this method should only return a string for now. In the future we may need to ensure all of our pets have some similar behaviors and that the interface would allow us to be sure of this (she also mentioned you can just put the interface in the model's folder for now).

To prototype the app, the servlets will need to first process the URI query parameters, make a cat or dog, and then load a JSP with that object. For the dog implementation of showAffection, your PM has asked you to have different reactions based on the dog's weight. See the diagram below.

Lastly, your PM also reminded you to use the JSTL so that we can escape our input and let our front-end developers have an easier time reading our code.

Notice that the forms are GET requests!

## Objectives:
* Put MVC to practice. Modularize your application to have models, views, and controllers.
* Implement JSTL tags
* Allow your controller to receive query parameters

## Tasks:
* Create an animal model containing the name, breed, and weight fields.
* Create a pet interface containing the String showAffection() signature
* Extend the animal model and implement the pet interface with both cat and dog models
* For the dog implementation of showAffection have different outputs depending on weight.
* Submit forms to two different routes. Process using two servlets and serve using two JSPs.
* Use the JSTL to render pages.
