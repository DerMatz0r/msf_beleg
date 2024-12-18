/*
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story
import java.util.regex.Pattern
import java.util.List
import java.io.FileWriter

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val userStories = resource.allContents.filter(User_Story).toList();
		println("------------------------------------------------")
		println("Titel:")
		println(userStories.get(0).title.substantiv)
		println(userStories.get(0).title.infinitiv.word)
		println("Rolle")
		println(userStories.get(0).rolle.substantiv)
		println("Ziel/Wunsch")
		println(userStories.get(0).ziel_wunsch.subject)
		println(userStories.get(0).ziel_wunsch.infinitiv.word)
		println("Nutzen")
		println(userStories.get(0).nutzen.subject)
		val verb = getInfinitiv(userStories.get(0).nutzen.verb)
		println(verb)
		createCSV(userStories)
		
	}
	
	def getInfinitiv(String input){
		val regex = "^(.*?zu)(.*?)zu(.*)$"
        val pattern = Pattern.compile(regex)
        val matcher = pattern.matcher(input)
        
        if (matcher.matches) {
            
            val group1 = matcher.group(1) 
            val group2 = matcher.group(2) 
            val group3 = matcher.group(3)
            
            val result = group1 + group2 + " " + group3
            return result
        } else {
            
        }
	}
	def createCSV(List<User_Story> userStories){
		val filePath = "F:/Progammierquatsch/BelegAufgabe/output.csv"
		val writer = new FileWriter(filePath)
		writer.write("Titel,Rolle,Ziel/Wunsch,Nutzen\n")
		for(userStory:userStories){
			val line = userStory.title.substantiv+" "+userStory.title.infinitiv.word+","
			+userStory.rolle.substantiv+","+userStory.ziel_wunsch.subject+" "
			+userStory.ziel_wunsch.infinitiv.word+","+userStory.nutzen.subject+" "+getInfinitiv(userStory.nutzen.verb)+"\n"
			writer.write(line)
		}
		writer.close()
	}
}
