# tailangchecker
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

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
	        implementation 'com.github.saitawngpha:tailangchecker:0.0.2'
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

# License
```
 MIT License

Copyright (c) 2023 Sai Tawng Pha

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
