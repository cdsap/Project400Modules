pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
rootProject.name="project"
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
plugins {
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.12.1"
    id("com.gradle.enterprise") version "3.16.1"
}

gradleEnterprise {
    server = "http://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        publishAlways()
        capture {
            isTaskInputFiles = true
        }
        isUploadInBackground = System.getenv("CI") == null
    }
}
include (":layer_0:module_0_1")
include (":layer_0:module_0_2")
include (":layer_0:module_0_3")
include (":layer_0:module_0_4")
include (":layer_0:module_0_5")
include (":layer_0:module_0_6")
include (":layer_0:module_0_7")
include (":layer_0:module_0_8")
include (":layer_0:module_0_9")
include (":layer_0:module_0_10")
include (":layer_0:module_0_11")
include (":layer_0:module_0_12")
include (":layer_0:module_0_13")
include (":layer_0:module_0_14")
include (":layer_0:module_0_15")
include (":layer_0:module_0_16")
include (":layer_0:module_0_17")
include (":layer_0:module_0_18")
include (":layer_0:module_0_19")
include (":layer_0:module_0_20")
include (":layer_0:module_0_21")
include (":layer_0:module_0_22")
include (":layer_0:module_0_23")
include (":layer_0:module_0_24")
include (":layer_0:module_0_25")
include (":layer_0:module_0_26")
include (":layer_0:module_0_27")
include (":layer_0:module_0_28")
include (":layer_0:module_0_29")
include (":layer_0:module_0_30")
include (":layer_0:module_0_31")
include (":layer_0:module_0_32")
include (":layer_0:module_0_33")
include (":layer_0:module_0_34")
include (":layer_0:module_0_35")
include (":layer_0:module_0_36")
include (":layer_1:module_1_37")
include (":layer_1:module_1_38")
include (":layer_1:module_1_39")
include (":layer_1:module_1_40")
include (":layer_1:module_1_41")
include (":layer_1:module_1_42")
include (":layer_1:module_1_43")
include (":layer_1:module_1_44")
include (":layer_1:module_1_45")
include (":layer_1:module_1_46")
include (":layer_1:module_1_47")
include (":layer_1:module_1_48")
include (":layer_1:module_1_49")
include (":layer_1:module_1_50")
include (":layer_1:module_1_51")
include (":layer_1:module_1_52")
include (":layer_1:module_1_53")
include (":layer_1:module_1_54")
include (":layer_1:module_1_55")
include (":layer_1:module_1_56")
include (":layer_1:module_1_57")
include (":layer_1:module_1_58")
include (":layer_1:module_1_59")
include (":layer_1:module_1_60")
include (":layer_1:module_1_61")
include (":layer_1:module_1_62")
include (":layer_1:module_1_63")
include (":layer_1:module_1_64")
include (":layer_1:module_1_65")
include (":layer_1:module_1_66")
include (":layer_1:module_1_67")
include (":layer_1:module_1_68")
include (":layer_1:module_1_69")
include (":layer_1:module_1_70")
include (":layer_1:module_1_71")
include (":layer_1:module_1_72")
include (":layer_1:module_1_73")
include (":layer_1:module_1_74")
include (":layer_1:module_1_75")
include (":layer_1:module_1_76")
include (":layer_1:module_1_77")
include (":layer_1:module_1_78")
include (":layer_1:module_1_79")
include (":layer_1:module_1_80")
include (":layer_1:module_1_81")
include (":layer_1:module_1_82")
include (":layer_1:module_1_83")
include (":layer_1:module_1_84")
include (":layer_1:module_1_85")
include (":layer_1:module_1_86")
include (":layer_1:module_1_87")
include (":layer_1:module_1_88")
include (":layer_1:module_1_89")
include (":layer_1:module_1_90")
include (":layer_2:module_2_91")
include (":layer_2:module_2_92")
include (":layer_2:module_2_93")
include (":layer_2:module_2_94")
include (":layer_2:module_2_95")
include (":layer_2:module_2_96")
include (":layer_2:module_2_97")
include (":layer_2:module_2_98")
include (":layer_2:module_2_99")
include (":layer_2:module_2_100")
include (":layer_2:module_2_101")
include (":layer_2:module_2_102")
include (":layer_2:module_2_103")
include (":layer_2:module_2_104")
include (":layer_2:module_2_105")
include (":layer_2:module_2_106")
include (":layer_2:module_2_107")
include (":layer_2:module_2_108")
include (":layer_2:module_2_109")
include (":layer_2:module_2_110")
include (":layer_2:module_2_111")
include (":layer_2:module_2_112")
include (":layer_2:module_2_113")
include (":layer_2:module_2_114")
include (":layer_2:module_2_115")
include (":layer_2:module_2_116")
include (":layer_2:module_2_117")
include (":layer_2:module_2_118")
include (":layer_2:module_2_119")
include (":layer_2:module_2_120")
include (":layer_2:module_2_121")
include (":layer_2:module_2_122")
include (":layer_2:module_2_123")
include (":layer_2:module_2_124")
include (":layer_2:module_2_125")
include (":layer_2:module_2_126")
include (":layer_2:module_2_127")
include (":layer_2:module_2_128")
include (":layer_2:module_2_129")
include (":layer_2:module_2_130")
include (":layer_2:module_2_131")
include (":layer_2:module_2_132")
include (":layer_2:module_2_133")
include (":layer_2:module_2_134")
include (":layer_2:module_2_135")
include (":layer_2:module_2_136")
include (":layer_2:module_2_137")
include (":layer_2:module_2_138")
include (":layer_2:module_2_139")
include (":layer_2:module_2_140")
include (":layer_2:module_2_141")
include (":layer_2:module_2_142")
include (":layer_2:module_2_143")
include (":layer_2:module_2_144")
include (":layer_2:module_2_145")
include (":layer_2:module_2_146")
include (":layer_2:module_2_147")
include (":layer_2:module_2_148")
include (":layer_2:module_2_149")
include (":layer_2:module_2_150")
include (":layer_2:module_2_151")
include (":layer_2:module_2_152")
include (":layer_2:module_2_153")
include (":layer_2:module_2_154")
include (":layer_2:module_2_155")
include (":layer_2:module_2_156")
include (":layer_2:module_2_157")
include (":layer_2:module_2_158")
include (":layer_2:module_2_159")
include (":layer_2:module_2_160")
include (":layer_2:module_2_161")
include (":layer_2:module_2_162")
include (":layer_2:module_2_163")
include (":layer_2:module_2_164")
include (":layer_2:module_2_165")
include (":layer_2:module_2_166")
include (":layer_2:module_2_167")
include (":layer_2:module_2_168")
include (":layer_2:module_2_169")
include (":layer_2:module_2_170")
include (":layer_2:module_2_171")
include (":layer_2:module_2_172")
include (":layer_2:module_2_173")
include (":layer_2:module_2_174")
include (":layer_2:module_2_175")
include (":layer_2:module_2_176")
include (":layer_2:module_2_177")
include (":layer_2:module_2_178")
include (":layer_2:module_2_179")
include (":layer_2:module_2_180")
include (":layer_2:module_2_181")
include (":layer_2:module_2_182")
include (":layer_2:module_2_183")
include (":layer_2:module_2_184")
include (":layer_2:module_2_185")
include (":layer_2:module_2_186")
include (":layer_2:module_2_187")
include (":layer_2:module_2_188")
include (":layer_2:module_2_189")
include (":layer_2:module_2_190")
include (":layer_2:module_2_191")
include (":layer_2:module_2_192")
include (":layer_2:module_2_193")
include (":layer_2:module_2_194")
include (":layer_2:module_2_195")
include (":layer_2:module_2_196")
include (":layer_2:module_2_197")
include (":layer_2:module_2_198")
include (":layer_2:module_2_199")
include (":layer_3:module_3_200")
include (":layer_4:module_4_201")
include (":layer_4:module_4_202")
include (":layer_4:module_4_203")
include (":layer_4:module_4_204")
include (":layer_4:module_4_205")
include (":layer_4:module_4_206")
include (":layer_4:module_4_207")
include (":layer_4:module_4_208")
include (":layer_4:module_4_209")
include (":layer_4:module_4_210")
include (":layer_4:module_4_211")
include (":layer_4:module_4_212")
include (":layer_4:module_4_213")
include (":layer_4:module_4_214")
include (":layer_4:module_4_215")
include (":layer_4:module_4_216")
include (":layer_4:module_4_217")
include (":layer_4:module_4_218")
include (":layer_4:module_4_219")
include (":layer_4:module_4_220")
include (":layer_4:module_4_221")
include (":layer_4:module_4_222")
include (":layer_4:module_4_223")
include (":layer_4:module_4_224")
include (":layer_4:module_4_225")
include (":layer_4:module_4_226")
include (":layer_4:module_4_227")
include (":layer_4:module_4_228")
include (":layer_4:module_4_229")
include (":layer_4:module_4_230")
include (":layer_4:module_4_231")
include (":layer_4:module_4_232")
include (":layer_4:module_4_233")
include (":layer_4:module_4_234")
include (":layer_4:module_4_235")
include (":layer_4:module_4_236")
include (":layer_4:module_4_237")
include (":layer_4:module_4_238")
include (":layer_4:module_4_239")
include (":layer_4:module_4_240")
include (":layer_4:module_4_241")
include (":layer_4:module_4_242")
include (":layer_4:module_4_243")
include (":layer_4:module_4_244")
include (":layer_4:module_4_245")
include (":layer_4:module_4_246")
include (":layer_4:module_4_247")
include (":layer_4:module_4_248")
include (":layer_4:module_4_249")
include (":layer_4:module_4_250")
include (":layer_4:module_4_251")
include (":layer_4:module_4_252")
include (":layer_4:module_4_253")
include (":layer_4:module_4_254")
include (":layer_4:module_4_255")
include (":layer_4:module_4_256")
include (":layer_4:module_4_257")
include (":layer_4:module_4_258")
include (":layer_4:module_4_259")
include (":layer_4:module_4_260")
include (":layer_4:module_4_261")
include (":layer_4:module_4_262")
include (":layer_4:module_4_263")
include (":layer_4:module_4_264")
include (":layer_4:module_4_265")
include (":layer_4:module_4_266")
include (":layer_4:module_4_267")
include (":layer_4:module_4_268")
include (":layer_4:module_4_269")
include (":layer_4:module_4_270")
include (":layer_4:module_4_271")
include (":layer_4:module_4_272")
include (":layer_4:module_4_273")
include (":layer_4:module_4_274")
include (":layer_4:module_4_275")
include (":layer_4:module_4_276")
include (":layer_4:module_4_277")
include (":layer_4:module_4_278")
include (":layer_4:module_4_279")
include (":layer_4:module_4_280")
include (":layer_4:module_4_281")
include (":layer_4:module_4_282")
include (":layer_4:module_4_283")
include (":layer_4:module_4_284")
include (":layer_4:module_4_285")
include (":layer_4:module_4_286")
include (":layer_4:module_4_287")
include (":layer_4:module_4_288")
include (":layer_4:module_4_289")
include (":layer_4:module_4_290")
include (":layer_4:module_4_291")
include (":layer_4:module_4_292")
include (":layer_4:module_4_293")
include (":layer_4:module_4_294")
include (":layer_4:module_4_295")
include (":layer_4:module_4_296")
include (":layer_5:module_5_297")
include (":layer_5:module_5_298")
include (":layer_5:module_5_299")
include (":layer_5:module_5_300")
include (":layer_5:module_5_301")
include (":layer_5:module_5_302")
include (":layer_5:module_5_303")
include (":layer_5:module_5_304")
include (":layer_5:module_5_305")
include (":layer_5:module_5_306")
include (":layer_5:module_5_307")
include (":layer_5:module_5_308")
include (":layer_5:module_5_309")
include (":layer_5:module_5_310")
include (":layer_5:module_5_311")
include (":layer_5:module_5_312")
include (":layer_5:module_5_313")
include (":layer_5:module_5_314")
include (":layer_5:module_5_315")
include (":layer_5:module_5_316")
include (":layer_5:module_5_317")
include (":layer_5:module_5_318")
include (":layer_5:module_5_319")
include (":layer_5:module_5_320")
include (":layer_5:module_5_321")
include (":layer_5:module_5_322")
include (":layer_5:module_5_323")
include (":layer_5:module_5_324")
include (":layer_5:module_5_325")
include (":layer_5:module_5_326")
include (":layer_5:module_5_327")
include (":layer_5:module_5_328")
include (":layer_5:module_5_329")
include (":layer_5:module_5_330")
include (":layer_5:module_5_331")
include (":layer_5:module_5_332")
include (":layer_5:module_5_333")
include (":layer_5:module_5_334")
include (":layer_5:module_5_335")
include (":layer_5:module_5_336")
include (":layer_5:module_5_337")
include (":layer_5:module_5_338")
include (":layer_5:module_5_339")
include (":layer_5:module_5_340")
include (":layer_5:module_5_341")
include (":layer_5:module_5_342")
include (":layer_5:module_5_343")
include (":layer_5:module_5_344")
include (":layer_6:module_6_345")
include (":layer_6:module_6_346")
include (":layer_6:module_6_347")
include (":layer_6:module_6_348")
include (":layer_6:module_6_349")
include (":layer_6:module_6_350")
include (":layer_6:module_6_351")
include (":layer_6:module_6_352")
include (":layer_6:module_6_353")
include (":layer_6:module_6_354")
include (":layer_6:module_6_355")
include (":layer_6:module_6_356")
include (":layer_6:module_6_357")
include (":layer_6:module_6_358")
include (":layer_6:module_6_359")
include (":layer_6:module_6_360")
include (":layer_6:module_6_361")
include (":layer_6:module_6_362")
include (":layer_6:module_6_363")
include (":layer_6:module_6_364")
include (":layer_6:module_6_365")
include (":layer_6:module_6_366")
include (":layer_6:module_6_367")
include (":layer_6:module_6_368")
include (":layer_6:module_6_369")
include (":layer_6:module_6_370")
include (":layer_6:module_6_371")
include (":layer_6:module_6_372")
include (":layer_6:module_6_373")
include (":layer_6:module_6_374")
include (":layer_6:module_6_375")
include (":layer_6:module_6_376")
include (":layer_7:module_7_377")
include (":layer_7:module_7_378")
include (":layer_7:module_7_379")
include (":layer_7:module_7_380")
include (":layer_7:module_7_381")
include (":layer_7:module_7_382")
include (":layer_7:module_7_383")
include (":layer_7:module_7_384")
include (":layer_7:module_7_385")
include (":layer_7:module_7_386")
include (":layer_7:module_7_387")
include (":layer_7:module_7_388")
include (":layer_7:module_7_389")
include (":layer_7:module_7_390")
include (":layer_7:module_7_391")
include (":layer_7:module_7_392")
include (":layer_7:module_7_393")
include (":layer_7:module_7_394")
include (":layer_7:module_7_395")
include (":layer_7:module_7_396")
include (":layer_7:module_7_397")
include (":layer_7:module_7_398")
include (":layer_7:module_7_399")
include (":layer_8:module_8_400")
