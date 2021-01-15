package io.callable.sdk.enums;

public enum GoogleSpeechRecognizerLanguage {

    Afrikaans_South_Africa("af-ZA"),
    Albanian_Albania("sq-AL"),
    Amharic_Ethiopia("am-ET"),
    Arabic_Algeria("ar-DZ"),
    Arabic_Bahrain("ar-BH"),
    Arabic_Egypt("ar-EG"),
    Arabic_Iraq("ar-IQ"),
    Arabic_Israel("ar-IL"),
    Arabic_Jordan("ar-JO"),
    Arabic_Kuwait("ar-KW"),
    Arabic_Lebanon("ar-LB"),
    Arabic_Morocco("ar-MA"),
    Arabic_Oman("ar-OM"),
    Arabic_Qatar("ar-QA"),
    Arabic_Saudi_Arabia("ar-SA"),
    Arabic_State_of_Palestine("ar-PS"),
    Arabic_Tunisia("ar-TN"),
    Arabic_United_Arab_Emirates("ar-AE"),
    Armenian_Armenia("hy-AM"),
    Azerbaijani_Azerbaijan("az-AZ"),
    Basque_Spain("eu-ES"),
    Bengali_Bangladesh("bn-BD"),
    Bengali_India("bn-IN"),
    Bulgarian_Bulgaria("bg-BG"),
    Burmese_Myanmar("my-MM"),
    Catalan_Spain("ca-ES"),
    Chinese_Cantonese_Traditional_Hong_Kong("yue-Hant-HK"),
    Chinese_Mandarin_Simplified_China("zh"),
    Chinese_Mandarin_Simplified_Hong_Kong("zh-HK"),
    Chinese_Mandarin_Simplified_Taiwan("zh-TW"),
    Croatian_Croatia("hr-HR"),
    Czech_Czech_Republic("cs-CZ"),
    Danish_Denmark("da-DK"),
    Dutch_Belgium("nl-BE"),
    Dutch_Netherlands("nl-NL"),
    English_Australia("en-AU"),
    English_Canada("en-CA"),
    English_Ghana("en-GH"),
    English_India("en-IN"),
    English_Ireland("en-IE"),
    English_Kenya("en-KE"),
    English_New_Zealand("en-NZ"),
    English_Nigeria("en-NG"),
    English_Philippines("en-PH"),
    English_Singapore("en-SG"),
    English_South_Africa("en-ZA"),
    English_Tanzania("en-TZ"),
    English_United_Kingdom("en-GB"),
    English_United_States("en-US"),
    Estonian_Estonia("et-EE"),
    Filipino_Philippines("fil-PH"),
    Finnish_Finland("fi-FI"),
    French_Canada("fr-CA"),
    French_France("fr-FR"),
    Galician_Spain("gl-ES"),
    Georgian_Georgia("ka-GE"),
    German_Germany("de-DE"),
    Greek_Greece("el-GR"),
    Gujarati_India("gu-IN"),
    Hebrew_Israel("he-IL"),
    Hindi_India("hi-IN"),
    Hungarian_Hungary("hu-HU"),
    Icelandic_Iceland("is-IS"),
    Indonesian_Indonesia("id-ID"),
    Italian_Italy("it-IT"),
    Japanese_Japan("ja-JP"),
    Javanese_Indonesia("jv-ID"),
    Kannada_India("kn-IN"),
    Khmer_Cambodia("km-KH"),
    Korean_South_Korea("ko-KR"),
    Lao_Laos("lo-LA"),
    Latvian_Latvia("lv-LV"),
    Lithuanian_Lithuania("lt-LT"),
    Macedonian_North_Macedonia("mk-MK"),
    Malay_Malaysia("ms-MY"),
    Malayalam_India("ml-IN"),
    Marathi_India("mr-IN"),
    Mongolian_Mongolia("mn-MN"),
    Nepali_Nepal("ne-NP"),
    Norwegian_Bokmal_Norway("nb-NO"),
    Persian_Iran("fa-IR"),
    Polish_Poland("pl-PL"),
    Portuguese_Brazil("pt-BR"),
    Portuguese_Portugal("pt-PT"),
    Punjabi_Gurmukhi_India("pa-guru-IN"),
    Romanian_Romania("ro-RO"),
    Russian_Russia("ru-RU"),
    Serbian_Serbia("sr-RS"),
    Sinhala_Sri_Lanka("si-LK"),
    Slovak_Slovakia("sk-SK"),
    Slovenian_Slovenia("sl-SI"),
    Spanish_Argentina("es-AR"),
    Spanish_Bolivia("es-BO"),
    Spanish_Chile("es-CL"),
    Spanish_Colombia("es-CO"),
    Spanish_Costa_Rica("es-CR"),
    Spanish_Dominican_Republic("es-DO"),
    Spanish_Ecuador("es-EC"),
    Spanish_El_Salvador("es-SV"),
    Spanish_Guatemala("es-GT"),
    Spanish_Honduras("es-HN"),
    Spanish_Mexico("es-MX"),
    Spanish_Nicaragua("es-NI"),
    Spanish_Panama("es-PA"),
    Spanish_Paraguay("es-PY"),
    Spanish_Peru("es-PE"),
    Spanish_Puerto_Rico("es-PR"),
    Spanish_Spain("es-ES"),
    Spanish_United_States("es-US"),
    Spanish_Uruguay("es-UY"),
    Spanish_Venezuela("es-VE"),
    Sundanese_Indonesia("su-ID"),
    Swahili_Kenya("sw-KE"),
    Swahili_Tanzania("sw-TZ"),
    Swedish_Sweden("sv-SE"),
    Tamil_India("ta-IN"),
    Tamil_Malaysia("ta-MY"),
    Tamil_Singapore("ta-SG"),
    Tamil_Sri_Lanka("ta-LK"),
    Telugu_India("te-IN"),
    Thai_Thailand("th-TH"),
    Turkish_Turkey("tr-TR"),
    Ukrainian_Ukraine("uk-UA"),
    Urdu_India("ur-IN"),
    Urdu_Pakistan("ur-PK"),
    Uzbek_Uzbekistan("uz-UZ"),
    Vietnamese_Vietnam("vi-VN"),
    Zulu_South_Africa("zu-ZA");

    private String language;

    private GoogleSpeechRecognizerLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }
}