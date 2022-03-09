import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name:'convetFromSpace'
})
export class CustomPipe implements PipeTransform
{
    transform(value: string, character:string) {

        return value.split(character).join('@');
        //return value.replace(character,'@');
    }

}