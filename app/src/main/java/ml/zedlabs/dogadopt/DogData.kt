package ml.zedlabs.dogadopt

import androidx.compose.ui.graphics.Color

object DogData {
    val dogList: List<Dog> = listOf(
        Dog(
            name = "LADY IVY",
            breed = "Bull Terrier Mix",
            about = "Female, Adult",
            location = "NY, USA",
            bio = "This 5 y/o, 50 lb, eager-to-please girl - Lady Ivy - has graduated her long-term training education and is ready to go into a foster-to-adopt or forever home!\n" +
                    "\n" +
                    "She would do best in a home with older respectful kids and adults that will give her the structure, rules, and boundaries that she needs to succeed. Ivy also needs to be your only pet.\n" +
                    "\n" +
                    "Ivy is a dog that likes to hang around her people. While this is a very endearing aspect of her personality, whomever is interested in her must also understand that she cannot be given too much affection as she was previously suffering from anxiety and it could resurface.",
            index = 0,
            imageDrawable = R.drawable.dog0
        ),
        Dog(
            name = "EJAY",
            breed = "Mixed Breed (Medium) Mix",
            about = "Male, Adult",
            bio = "Ejay Location: Brooklyn, NY Breed: Mixed Breed Approximate Age: 6 years young Sex: Male Weight: 57 lbs Medical History: Ejay is neutered, up to date on shots, microchipped. Ejay has a skin condition. \uD83D\uDC36Other Dogs: No ❌ (ok with resident dogs in the home) \uD83D\uDE3DCats: No ❌ \uD83C\uDFE0House-trained: Yes ✅ ⭐️ Crate-trained: Yes ✅ \uD83D\uDC6BKids: Yes ✅ If you would like to foster or adopt Ejay, please contact AmsterDog at 917-689-8414 or info@amsterdog.org. To get the process started, please fill out our online application",
            location = "ATL, USA",
            index = 1,
            imageDrawable = R.drawable.dog1
        ),
        Dog(
            name = "Chucky ",
            breed = "Chihuahua Mix",
            about = "Male, Senior",
            bio = "Chucky is 8 years old and weighs 7lbs Meet Chucky! He is tiny with a huge personality. His fosters note him to be very affectionate but can be independent sometimes. He likes to go on off leash walks in enclosed areas. He can be easily startled by strangers but doesn't really pay mind to other dogs. Ultimately, Chucky is a cuddle bug and enjoys most of his time wandering near his person. Chucky is a older dog who needs someone who can be patient and understanding of his behavior. He is very sweet once warmed up but will do better with a slow approach.",
            location = "LA, USA",
            index = 2,
            imageDrawable = R.drawable.dog2
        ),
        Dog(
            name = "Scout",
            breed = "Terrier (Unknown Type, Small)/Chihuahua Mix",
            about = "Male. Adult",
            bio = "Scout is a 4-ish years, 10-pound neutered male terrier mix, with a pearly white smile! He found himself at the ACC and Waggytail scooped him up and placed him into a top-notch Board & Train (dog-training) Program with ClarityK9.com (check him out on their Instagram page https://www.instagram.com/clarity.k9/). He has been in training for 2+ months and is ready to graduate to his forever home!",
            location = "NY, USA",
            index = 3,
            imageDrawable = R.drawable.dog3
        ),
        Dog(
            name = "Bonnie",
            breed = "Mixed Breed (Medium) Mix",
            about = "Female, Adult",
            bio = "Bonnie has a very loving personality. She is smart, intuitive, playful and a little silly at times. She is fully housebroken and knows how to sit, lay down, and roll over. While she doesn't like going in the crate, she will remain calm once inside. Bonnie's foster mom reports that she is very respectful of household properties such as beds, couches and even trash; she won't touch it unless you give her permission",
            location = "NY, USA",
            index = 4,
            imageDrawable = R.drawable.dog4
        ),
        Dog(
            name = "Squirrely",
            breed = "Mixed Breed (Medium) Mix",
            about = "Female, Senior",
            bio = "Squirrely is a sweet, older girl looking for her new best friend. She can be a bit shy at first, but she warms up quickly. Squirrely's unique bushy tail, and her playful excitement hops, led to her name. While Squirrely is excited to meet other dogs, she isn't quite sure how to play with them yet. Squirrely appear is house trained and responds well to \"sit\" and \"no\". Squirrely has been a good work from home buddy for her foster mom so far",
            location = "ATL, USA",
            index = 5,
            imageDrawable = R.drawable.dog5
        ),
        Dog(
            name = "Peek-A-Boo",
            breed = "Pointer Mix",
            about = "Male, Senior",
            bio = "Peekaboo is the coolest pup in school! He recently earned his BA in his Canine Life and Social Skills class and he can't wait to share all the things he learned with you. Peekaboo loves walks and car rides, especially if the car rides include air conditioning. On sleepovers, he loves to curl up on the blankets, or he might also stretch out and take up the whole bed, after all, being such a smart dog is hard work!",
            location = "SA, USA",
            index = 6,
            imageDrawable = R.drawable.dog6
        ),
    )

    fun getColorLight(): Color {
        return listOf(
            Color(0xFFFDB5B0),
            Color(0xffFCD4D4),
            Color(0xFFFDABB1),
            Color(0xFFF8F1B4),
            Color(0xFFCBFCFC),
            Color(0xFFA5EEEE),
            Color(0xFFF8AFAF),
            Color(0xFFC6FDD9),
            Color(0xFFFFB5DA)
        ).random()
    }
}