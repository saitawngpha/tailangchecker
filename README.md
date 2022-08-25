# tailangchecker
Tai Language Checker for Android library
>Android library တွၼ်ႈတႃႇတေထတ်းတူၺ်း ထႅဝ်လိၵ်ႈၼႆႉ ၸွင်ႇၸႂ်ႈၽႃသႃလိၵ်ႈတႆး။

# Theory of regex
I am using the ` a(?:bc)* using ?: we disable the capturing group ` to check Shan or Tai Language in a sentense words. The rule for Tai language in one word is starting with a consonant, follow by vowels and tones. Please have a look from below diagram for more details.

![](diagram.png)

# How to use TaiLangChecker Library
Step 1. Add the JitPack repository to your build file 
  ```
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  If you are using Android Studio Bumble bee or latest version, add JitPack repository to `settings.gradle` file.
  ```
  dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' } // add this line
    }
}
```
  
  
Step 2. Add the dependency
  

	dependencies {
	        implementation 'com.github.saitawngpha:tailangchecker:0.0.1'
	}


Step 3. Add this line into your Activity class. `TaiLangChecker.taiLangChecker("your text here")`
  
    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("###! ${TaiLangChecker.taiLangChecker("ႁဝ်းပဵၼ်")}")
           
    }
    

# Demo
A Sentense is Tai Language |  A Sentense is not Tai Language
:-------------------------:|:-------------------------:
![](1.png)  |  ![](2.png)
